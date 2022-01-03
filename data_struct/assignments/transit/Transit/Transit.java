import java.util.ArrayList;

/**
 * This class contains methods which perform various operations on a layered linked
 * list to simulate transit
 * 
 * @author Ishaan Ivaturi
 * @author Prince Rawal
 */
public class Transit {
	/**
	 * Makes a layered linked list representing the given arrays of train stations, bus
	 * stops, and walking locations. Each layer begins with a location of 0, even though
	 * the arrays don't contain the value 0.
	 * 
	 * @param trainStations Int array listing all the train stations
	 * @param busStops Int array listing all the bus stops
	 * @param locations Int array listing all the walking locations (always increments by 1)
	 * @return The zero node in the train layer of the final layered linked list
	 */
	public static TNode makeList(int[] trainStations, int[] busStops, int[] locations) {

		//Declaring the front pointers to each list (each with a value of 0)
		TNode frontTrainStation = new TNode();
		TNode frontBusStation = new TNode();
		TNode frontWalkStation = new TNode();

		//Connecting the first node of each transport method
		frontTrainStation.down = frontBusStation;
		frontBusStation.down = frontWalkStation;

		//Loops variable for iterations and creating the lists
		TNode ptr = frontTrainStation;
		TNode temp = null;

		ArrayList<TNode> downNodesTrain = new ArrayList<TNode>();

		//Makes the list of train stations
		for(int i = 0; i < trainStations.length; i++){
			//Creating a new Node with the array value
			temp = new TNode(trainStations[i]);
			//Links the nodes together
			ptr.next = temp;
			//Iterates to the next Node
			ptr = temp;


			ptr.down = new TNode(trainStations[i]);
			downNodesTrain.add(ptr.down);
		}

		
		ArrayList<TNode> downNodesBus = new ArrayList<TNode>();

		ptr = frontBusStation;
		int j = 0;
		//Makes the list for bus stations
		for(int i = 0; i < busStops.length; i++){
			if(j != trainStations.length && trainStations[j] == busStops[i]){
				ptr.next = downNodesTrain.get(j);
				j++;
				ptr = ptr.next;
			} else {
				//Creating a new Node with the array value
				temp = new TNode(busStops[i]);
				//Links the nodes together
				ptr.next = temp;
				//Iterates to the next Node
				ptr = temp;
			}
			ptr.down = new TNode(busStops[i]);
			downNodesBus.add(ptr.down);
		}

		ptr = frontWalkStation;
		int k = 0;
		//Makes the list for walking stations
		for(int i = 0; i < locations.length; i++){
			if(k != busStops.length && busStops[k] == locations[i]){
				ptr.next = downNodesBus.get(k);
				k++;
				ptr = ptr.next;
			} else {
				//Creating a new Node with the array value
				temp = new TNode(locations[i]);
				//Links the nodes together
				ptr.next = temp;
				//Iterates to the next Node
				ptr = temp;
			}
		}

		return frontTrainStation;
	}
	
	/**
	 * Modifies the given layered list to remove the given train station but NOT its associated
	 * bus stop or walking location. Do nothing if the train station doesn't exist
	 * 
	 * @param trainZero The zero node in the train layer of the given layered list
	 * @param station The location of the train station to remove
	 */
	public static void removeTrainStation(TNode trainZero, int station) {
		for(TNode temp = trainZero; temp != null; temp = temp.next){
			if(temp.next != null && temp.next.location == station){
				temp.next = temp.next.next;
			}
		}
	}

	/**
	 * Modifies the given layered list to add a new bus stop at the specified location. Do nothing
	 * if there is no corresponding walking location.
	 * 
	 * @param trainZero The zero node in the train layer of the given layered list
	 * @param busStop The location of the bus stop to add
	 */
	public static void addBusStop(TNode trainZero, int busStop) {
		TNode busZero = trainZero.down;
		TNode ptr = busZero;
		while(ptr != null){

			//Checks to see if the busStop is already in the list
			// if(ptr.location == busStop || ptr.next == null || ptr.next.location == busStop){
			// 	return;
			// }

			if(ptr.location < busStop && (ptr.next == null || ptr.next.location > busStop)){
				TNode temp = new TNode(busStop);
				temp.next = ptr.next;
				ptr.next = temp;
				ptr = temp;
				break;
			}

			ptr = ptr.next;

		}

		if(ptr == null) return;

		TNode walkZero = busZero.down;
		for(TNode temp = walkZero.next; temp != null; temp = temp.next){
			if(temp.location == busStop ){
				ptr.down = temp;
				break;
			}
		}

	}
	
	/**
	 * Determines the optimal path to get to a given destination in the walking layer, and 
	 * collects all the nodes which are visited in this path into an arraylist. 
	 * 
	 * @param trainZero The zero node in the train layer of the given layered list
	 * @param destination An int representing the destination
	 * @return
	 */
	public static ArrayList<TNode> bestPath(TNode trainZero, int destination) {
		ArrayList<TNode> path = new ArrayList<TNode>();
		TNode ptr = trainZero;

		while(ptr.down != null){ //Finds the most optimal path to the walking layer

			path.add(ptr);

			/**
			 * ptr.next is to check for edge cases when we are at the end of the first and second layers
			 * Pushes the pointer down to the lower layers/Also prevents null pointer exceptions
			 */
			if(ptr.location == destination || ptr.next == null){ 
				ptr = ptr.down;
				continue;
			}

			//Prevents overshooting in a particular layer
			if(ptr.next.location > destination){ 
				ptr = ptr.down;
				continue;
			}
			
			ptr = ptr.next; //Updating to the next node
		}

		path.add(ptr); //Adding the last node when the ptr enters the walking layer 

		//Continues traversing through the walking layer until it finds the destination
		while(ptr.location != destination){
			ptr = ptr.next;
			path.add(ptr);
		}
		
		return path;
	}

	/**
	 * Returns a deep copy of the given layered list, which contains exactly the same
	 * locations and connections, but every node is a NEW node.
	 * 
	 * @param trainZero The zero node in the train layer of the given layered list
	 * @return
	 */
	public static TNode duplicate(TNode trainZero) {

		//Init front of each layer
		TNode trainZ = new TNode(trainZero.location);
		TNode busZero = new TNode(trainZero.down.location);
		TNode walkZero = new TNode(trainZero.down.down.location);

		//Connecting the fronts
		trainZ.down = busZero;
		busZero.down = walkZero;

		ArrayList<TNode> trainDownNodes = new ArrayList<TNode>();
		TNode tempTrainPtr = trainZ;
		TNode temp;

		for(TNode ptr = trainZero.next; ptr != null; ptr = ptr.next){

			temp = new TNode(ptr.location);

			temp.down = new TNode(ptr.down.location);
			trainDownNodes.add(temp.down);
			
			tempTrainPtr.next = temp;
			tempTrainPtr = tempTrainPtr.next;
		}


		int i = 0;
		ArrayList<TNode> busDownNodes = new ArrayList<TNode>();
		// TNode tempBusPtr = busZero;
		for(TNode ptr = trainZero.down.next; ptr != null; ptr = ptr.next){
			if(i != trainDownNodes.size() && ptr.location == trainDownNodes.get(i).location){
				busZero.next = trainDownNodes.get(i);
				busZero = busZero.next;
				busZero.down = new TNode(trainDownNodes.get(i).location);
				busDownNodes.add(busZero.down);
				i++;
				continue;
			}

			temp = new TNode(ptr.location);

			temp.down = new TNode(ptr.down.location);
			busDownNodes.add(temp.down);
			
			busZero.next = temp;
			
			busZero = busZero.next;
		}

		int j = 0;
		for(TNode ptr = trainZero.down.down.next; ptr != null; ptr = ptr.next){
			if(j != busDownNodes.size() && ptr.location == busDownNodes.get(j).location){
				walkZero.next = busDownNodes.get(j);
				walkZero = walkZero.next;
				j++;
				continue;
			}

			temp = new TNode(ptr.location);
			walkZero.next = temp;
			walkZero = walkZero.next;
		}

		return trainZ;
	}

	/**
	 * Modifies the given layered list to add a scooter layer in between the bus and
	 * walking layer.
	 * 
	 * @param trainZero The zero node in the train layer of the given layered list
	 * @param scooterStops An int array representing where the scooter stops are located
	 */
	public static void addScooter(TNode trainZero, int[] scooterStops) {

		//Connecting the 0th node of each layer
		TNode scooterZero = new TNode(0);
		scooterZero.down = trainZero.down.down;
		trainZero.down.down = scooterZero;

		//Creating new down pointers from the bus layer
		ArrayList<TNode> busDownNodes = new ArrayList<TNode>();
		TNode down;
		for(TNode ptr = trainZero.down.next; ptr != null; ptr = ptr.next){
			down = new TNode(ptr.location);
			ptr.down = down;
			busDownNodes.add(ptr.down);
		}

		//Making the scooter layer
		ArrayList<TNode> scooterDownNodes = new ArrayList<TNode>();
		int j = 0;
		TNode tempScooterPtr = scooterZero; //Not needed but just to make the references organized
		TNode temp;
		for(int i = 0; i < scooterStops.length; i++){
			if(j != busDownNodes.size() && busDownNodes.get(j).location == scooterStops[i]){
				tempScooterPtr.next = busDownNodes.get(j);
				tempScooterPtr = tempScooterPtr.next;
				tempScooterPtr.down = new TNode(busDownNodes.get(j).location);
				scooterDownNodes.add(tempScooterPtr.down);
				j++;
				continue;
			}
			temp = new TNode(scooterStops[i]);
			temp.down = new TNode(scooterStops[i]);
			scooterDownNodes.add(temp.down);
			tempScooterPtr.next = temp;
			tempScooterPtr = tempScooterPtr.next;
		}

		//Connecting scooter layer to walking layer
		int k = 0;
		for(TNode ptr = scooterZero.down; ptr.next != null; ptr = ptr.next){
			if(k != scooterDownNodes.size() && ptr.next.location == scooterDownNodes.get(k).location){
				temp = ptr.next;
				ptr.next = scooterDownNodes.get(k);
				ptr.next.next = temp.next;
				k++;
			}
		}


	}
}