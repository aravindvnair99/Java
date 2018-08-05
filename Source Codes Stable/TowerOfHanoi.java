//Tower of Hanoi demo program

class TowerOfHanoi {
	static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
		if (n == 1) {
			System.out.println("Moved disk 1 from rod " +  from_rod + " to rod " + to_rod);
			return;
		}
		towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
		System.out.println("Moved disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
		towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
	}
	public static void main(String args[]) {
		int n = 3; // Number of disks
		towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C are names of rods
	}
}