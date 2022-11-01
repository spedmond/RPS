public class Rock {
    private String user;
    private String comp;

    public Rock(String user) {
        this.user = user.toLowerCase();
    }

    public String randomMove() {
        int rand = (int)(Math.random()*3) + 1;
        if (rand == 1) {
            comp = "rock";
        }
        if (rand == 2) {
            comp = "paper";
        }
        if (rand == 3) {
            comp = "scissors";
        }
        return comp;
    }

    public void findWinner() {
        String result = "";
        if (user.equals(comp)) {
            result = "It's a tie!";
        }
        else if (user.equals("rock")) {
            if (comp.equals("scissors")) {
                result = "You win!";
            }
            else if (comp.equals("paper")) {
                result = "You lose!";
            }
        }
        else if (user.equals("paper")) {
            if (comp.equals("rock")) {
                result =  "You win!";
            }
            else if (comp.equals("scissors")) {
                result = "You lose!";
            }
        }
        else if (user.equals("scissors")) {
            if (comp.equals("paper")) {
                result =  "You win!";
            }
            else if (comp.equals("rock")) {
                result = "You lose!";
            }
        }
        else {
            result = "Choice must be: rock, paper, or scissors";
        }
        System.out.println(result);
    }
}