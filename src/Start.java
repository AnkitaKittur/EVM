import javax.swing.JOptionPane;

public class Start {
	public static void main(String[] a)
	  {
	    VoteTable table = new VoteTable();   // construct model object

	    // tabulate the votes:
	    boolean processing = true;
	    while ( processing )
	          { String s = JOptionPane.showInputDialog(
		                 "Please type the last name of your candidate:");
	            if ( s == null )  // did election official press Cancel ?
	                 { processing = false; }  // yes, time to quit
	            else { if ( s.equals("Alpesh") )
		              { table.voteForAlpesh(); }
	                   else if ( s.equals("Ankita") )
			      { table.voteForAnkita(); }
	                   else if ( s.equals("Sameeda") )
			      { table.voteForSameeda(); }
			   else { } // it's an invalid vote and is lost forever...
	                 }
	           }
	     // total the votes:
	     System.out.println( table.computeTotals() );
	     System.exit(0);  // terminate program (including graphics components)
	  }
	}

