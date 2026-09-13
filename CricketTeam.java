class Player { String name; Player(String name) { this.name = name; } void play() { System.out.println("Player is playing"); } }
class Batsman extends Player { Batsman(String name) { super(name); } void play() { System.out.println(name + " is batting"); } }
class Bowler extends Player { Bowler(String name) { super(name); } void play() { System.out.println(name + " is bowling"); } }
class AllRounder extends Player { AllRounder(String name) { super(name); } void play() { System.out.println(name + " can bat and bowl"); } }
public class CricketTeam { public static void main(String[] args) { Player p = new Batsman("Virat"); p.play(); p = new Bowler("Bumrah"); p.play(); p = new AllRounder("Hardik"); p.play(); } }
