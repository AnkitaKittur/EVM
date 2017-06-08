
public class VoteTable {
	  private int[] vote; // holds the votes for the candidates
	                      // vote[0] holds Alpesh's votes
	                      // vote[1] holds Ankita's votes
	                      // vote[2] holds Sameeda's votes

	  /** Constructor  VoteTable  initializes the table */
	  public VoteTable()
	  { vote = new int[3]; }  // all cells are automatically set to 0

	  /** voteForAlpesh  adds one more vote to Alpesh's total */
	  public void voteForAlpesh()
	  { vote[0] = vote[0] + 1; }

	  /** voteForAnkita adds one more vote to Ankita's total */
	  public void voteForAnkita()
	  { vote[1] = vote[1] + 1; }

	  /** voteForSameeda  adds one more vote to Sameeda's total */
	  public void voteForSameeda()
	  { vote[2] = vote[2] + 1; }

	  /** computeTotals reports the votes for the three candidates
	    * @return a string that lists the candidates and their votes. */
	  public String computeTotals()
	  { return   "Alpesh = " + vote[0] + "\n"
	           + "Ankita = " + vote[1] + "\n"
	           + "Sameeda= " + vote[2] + "\n" ; }
	}
	
