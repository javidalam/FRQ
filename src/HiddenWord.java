public class HiddenWord
{
    private String puzzle;

    public HiddenWord(String puzzle)
    {
        this.puzzle = puzzle;
    }

    public String getHint(String guess)
    {
        String hint = "";
        for(int i = 0; i < guess.length(); i++)
        {
            if (guess.substring(i, i + 1).equals(puzzle.substring(i, i + 1)))
            {
                hint += guess.substring(i, i+1);
            }
            else if(puzzle.indexOf(guess.substring(i, i+1)) >=0)
            {
                hint += "+";
            }
        }
    }
}
