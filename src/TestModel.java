
public class TestModel 
	{ public static void main(String[] a)
	  { VoteTable t = new VoteTable();

	    System.out.println(t.computeTotals());  // all candidates should have 0s

	    t.voteForSameeda(); 
	    System.out.println(t.computeTotals());  // Sameeda should have 1

	    t.voteForAnkita();
	    System.out.println(t.computeTotals());  // Sameeda and Ankita should have 1

	  }
	}

