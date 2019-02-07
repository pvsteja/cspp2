class Game{
	int size;
	Player[] player;
	public Game(int count) {
		player = new Player[count];
		size = 0;
	}
	public void addPlayer(Player p){
		if (size <= player.length) {
			player[size] = p;
			size++;
		}
	}
	public void winner(){
		for (int i = 0; i < player.length; i++) {
			if (player[i].getScore() == 100) {
				System.out.println(player[i].getName());
			}
		}
	}
	public int indexOf(String name){
		for (int i = 0; i <= player.length; i++) {
			if (player[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
class Player{
	private String name;
	private int score;
	public Player(String name){
		this.name = name;
		this.score = score;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}
	public String getName(){
		return name;
	}
	public String toString() {
		return this.name;
	}

}