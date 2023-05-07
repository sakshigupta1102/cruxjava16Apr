package session5;
import java.util.*;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=scan.nextInt();
		int i=0;
		while (i<n) {
			System.out.println("*");
			i+=1;
		}
		System.out.println("-----------------------------"+1+"-----------------------------");
		int row=1;
		int nst=n;
		while (row<=n) {
			int cst=1;
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+2+"-----------------------------");
		row=1;
		nst=1;
		while (row<=n) {
			int cst=1;
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			System.out.println();
			row+=1;
			nst+=1;
		}
		System.out.println("-----------------------------"+3+"-----------------------------");
		nst=n;
		row=1;
		while (row<=n) {
			int cst=1;
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			System.out.println();
			row+=1;
			nst-=1;
		}
		System.out.println("-----------------------------"+4+"-----------------------------");
		row=1;
		nst=1;
		int nsp=n-1;
		while (row<=n) {
			int cst=1,csp=1;
			while (csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			System.out.println();
			row+=1;
			nsp-=1;
			nst+=1;
		}
		System.out.println("-----------------------------"+5+"-----------------------------");
		row=1;
		nst=n;
		nsp=0;
		while (row<=n) {
			int cst=1;
			int csp=1;
			while (csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			System.out.println();
			row+=1;
			nsp+=1;
			nst-=1;
		}
		System.out.println("-----------------------------"+6+"-----------------------------");
		row=1;
		nst=n;
		nsp=0;
		while (row<=n) {
			int cst=1;
			int csp=1;
			while (csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			System.out.println();
			row+=1;
			nst-=1;
			nsp+=2;
		}
		System.out.println("-----------------------------"+7+"-----------------------------");
		row=1;
		nst=n;
		nsp=n-2;
		while (row<=n) {
			int csp=1;
			int cst=1;
			if (row==1||row==n) {
				nsp=0;
				nst=n;
			}
			else {
				nsp=n-2;
				nst=n-nsp;
			}
			while (cst<=nst/2) {
				System.out.print("* ");
				cst+=1;
			}
			while (csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+8+"-----------------------------");
		row=1;
		while (row<=n) {
			int col=1;
			while(col<=n) {
				if (row==col||row+col==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				col+=1;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+9+"-----------------------------");
		row=1;
		nst=1;
		nsp=n-1;
		while (row<=n) {
			int csp=1;
			int cst=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}

			System.out.println();
			row+=1;
			nst+=2;
			nsp-=1;
		}
		System.out.println("-----------------------------"+10+"-----------------------------");
		row=1;
		nst=(2*n)-1;
		nsp=0;
		while (row<=n) {
			int cst=1;
			int csp=1;
			while (csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			System.out.println();
			row+=1;
			nsp+=1;
			nst-=2;
		}
		System.out.println("-----------------------------"+11+"-----------------------------");
		row=1;
		nst=1;
		nsp=n-1;
		while(row<=n) {
			int cst=1;
			int csp=1;
			while (csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				if (cst%2==0) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
				cst+=1;
			}
			System.out.println();
			nsp-=1;
			nst+=2;
			row+=1;
		}
		System.out.println("-----------------------------"+12+"-----------------------------");
		row=1;
		nst=1;
		nsp=n-1;
		while(row<=n) {
			int cst=1;
			int csp=1;
			while (csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				if (cst%2==0) {
					System.out.print("! ");
				}
				else {
					System.out.print("* ");
				}
				cst+=1;
			}
			System.out.println();
			nsp-=1;
			nst+=2;
			row+=1;
		}
		System.out.println("-----------------------------"+13+"-----------------------------");
		row=1;
		nst=1;
		while(row<=(2*n)-1) {
			int cst=1;
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			System.out.println();
			if (row<n) {
				nst+=1;
			}
			else {
				nst-=1;
			}
			row+=1;
		}
		System.out.println("-----------------------------"+14+"-----------------------------");
		row=1;
		nst=1;
		nsp=n-1;
		while(row<=(2*n)-1) {
			int cst=1,csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			System.out.println();
			if (row<n) {
				
				nst+=1;
				nsp-=1;
			}
			else {
				nst-=1;
				nsp+=1;
			}
			row+=1;
		}
		System.out.println("-----------------------------"+15+"-----------------------------");
		row=1;
		nsp=0;
		nst=n;
		while (row<=(2*n)-1) {
			int cst=1,csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			if (row<n) {
				nsp+=2;
				nst-=1;
			}
			else {
				nsp-=2;
				nst+=1;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+16+"-----------------------------");
		row=1;
		nst=n;
		nsp=n-1;
		while(row<=(2*n)-1) {
			int cst=1,csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while(cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			if (row<n) {
				nsp-=1;
				nst-=1;
			}
			else {
				nsp+=1;
				nst+=1;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+17+"-----------------------------");
		n=7;
		row=1;
		nsp=1;
		nst=n-1;
		while(row<=n) {
			int cst=1,csp=1;
			while(cst<=nst/2) {
				System.out.print("* ");
				cst+=1;
			}
			while(csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while(cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			if (row<=n/2) {
				nst-=2;
				nsp+=2;
			}
			else if (row==(n/2)) {
				nst=0;
				nsp=n;
			}
			else {
				nst+=2;
				nsp-=2;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+18+"-----------------------------");
		n=7;
		row=1;
		nst=1;
		nsp=n-1;
		while(row<=n) {
			int cst=1,csp=1;
			while(csp<=nsp/2) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			while (csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			if (row<n/2) {
				nsp-=2;
				nst+=2;
			}
			else if (row==n/2) {
				nsp=0;
				nst=n;
			}
			else {
				nsp+=2;
				nst-=2;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+19+"-----------------------------");
		row=1;
		n=7;
		nst=n;
		nsp=0;
		while (row<=n) {
			int cst=1,csp=1;
			while (cst<=nst/2) {
				System.out.print("* ");
				cst+=1;
			}
			while (csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print("* ");
				cst+=1;
			}
			if (row<=n/2) {
				nst=n-(2*(row-1))-1;
				nsp=(2*row)-1;
			}
			else if (row==n-1) {
				nst=n;
				nsp=0;
			}
			else {
				nst+=2;
				nsp-=2;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+20+"-----------------------------");
		n=7;
		row=1;
		nst=1;
		nsp=n-4;
		while (row<=n) {
			int cst=1,csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			while (cst<=nst) {
				if (cst==1||cst==nst) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				cst++;
			}
			if (row<4) {
				nst+=2;
				nsp--;
			}
			else {
				nsp++;
				nst-=2;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+21+"-----------------------------");
		n=5;
		row=1;
		nst=(2*n)-1;
		while(row<=n) {
			int cst=1;
			while (cst<=nst) {
				if (cst<=row||cst+row>=(2*n)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				cst+=1;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+22+"-----------------------------");
		n=5;
		row=1;
		int nst1=n;
		nsp=-1;
		int nst2=n-1;
		while (row<=n) {
			int cst1=1,csp=1,cst2=1;
			while (cst1<=nst1) {
				System.out.print("* ");
				cst1++;
			}
			while (csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			while (cst2<=nst2) {
				System.out.print("* ");
				cst2++;
			}
			System.out.println();
			row+=1;
			nst1--;
			nsp+=2;
			if (row==2) {
				nst2=nst2;
			}
			else {
				nst2--;
			}
		}
		System.out.println("-----------------------------"+23+"-----------------------------");
		row=1;
		nst=1;
		nsp=n-1;
		while (row<=n) {
			int csp=1;
			int cst=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print("1 ");
				cst+=1;
			}

			System.out.println();
			row+=1;
			nst+=2;
			nsp-=1;
		}
		System.out.println("-----------------------------"+24+"-----------------------------");
		row=1;
		nst=1;
		nsp=n-1;
		while (row<=n) {
			int csp=1;
			int cst=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print(row+" ");
				cst+=1;
			}

			System.out.println();
			row+=1;
			nst+=2;
			nsp-=1;
		}
		System.out.println("-----------------------------"+25+"-----------------------------");
		row=1;
		nst=1;
		nsp=n-1;
		int num=1;
		while (row<=n) {
			int csp=1;
			int cst=1;
			while(csp<=nsp) {
				System.out.print(" \t");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print(num+"\t");
				num++;
				cst+=1;
			}

			System.out.println();
			row+=1;
			nst+=2;
			nsp-=1;
		}
		System.out.println("-----------------------------"+26+"-----------------------------");
		row=1;
		nst=1;
		nsp=n-1;
		while (row<=n) {
			int csp=1;
			int cst=1;
			while(csp<=nsp) {
				System.out.print(" \t");
				csp+=1;
			}
			while (cst<=nst) {
				System.out.print(cst+"\t");
				cst+=1;
			}

			System.out.println();
			row+=1;
			nst+=2;
			nsp-=1;
		}
		System.out.println("-----------------------------"+27+"-----------------------------");
		row=1;
		nst=1;
		nsp=n-1;
		while (row<=n) {
			int csp=1;
			int cst=1;
			int cstn=1;
			while(csp<=nsp) {
				System.out.print(" \t");
				csp+=1;
			}
			while (cst<=nst) {
				if (cst<=nst/2) {
					System.out.print(cstn+"\t");
					cstn++;
				}
				else {
					System.out.print(cstn+"\t");
					cstn--;
				}
				cst+=1;
			}
			System.out.println();
			row+=1;
			nst+=2;
			nsp-=1;
		}
		System.out.println("-----------------------------"+28+"-----------------------------");
		row=1;
		nst=1;
		nsp=n-1;
		while (row<=n) {
			int cstn=row;
			int csp=1;
			int cst=1;
			while(csp<=nsp) {
				System.out.print(" \t");
				csp+=1;
			}
			while (cst<=nst) {
				if (cst<=nst/2) {
					System.out.print(cstn+"\t");
					cstn++;
				}
				else {
					System.out.print(cstn+"\t");
					cstn--;
				}
				cst+=1;
			}
			System.out.println();
			row+=1;
			nst+=2;
			nsp-=1;
		}
		System.out.println("-----------------------------"+29+"-----------------------------");
		row=1;
		nst=1;
		nsp=n-1;
		while (row<=n) {
			int csp=1;
			int cst=1;
			while(csp<=nsp) {
				System.out.print(" \t");
				csp+=1;
			}
			while (cst<=nst) {
				if (cst==1||cst==nst) {
					System.out.print(row+"\t");
				}
				else {
					System.out.print(0+"\t");
				}
				cst+=1;
			}
			System.out.println();
			row+=1;
			nst+=2;
			nsp-=1;
		}
		System.out.println("-----------------------------"+30+"-----------------------------");
		row=1;
		nst=n;
		while (row<=n) {
			int cst=nst;
			while (cst>0) {
				System.out.print(cst+"\t");
				cst-=1;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+31+"-----------------------------");
		row=1;
		nst=n;
		while (row<=n) {
			int cst=nst;
			while (cst>0) {
				if (cst==row) {
					System.out.print("*\t");
				}
				else {
					System.out.print(cst+"\t");
				}
				cst-=1;
			}
			System.out.println();
			row+=1;
		}
		System.out.println("-----------------------------"+32+"-----------------------------");
		row=1;
		nst=1;
		int a=1;
		while (row<=(2*n)-1) {
			int cst=1;
			while(cst<=nst) {
				if (cst%2!=0) {
					System.out.print(a+" ");
				}
				else {
					System.out.print("* ");
				}
				cst+=1;
			}
			System.out.println();
			row+=1;
			if (row<=n) {
				nst+=2;
				a+=1;
			}
			else {
				nst-=2;
				a-=1;
			}
		}
		System.out.println("-----------------------------"+32+"-----------------------------");
		n=10;
		row=1;
		nst=1;
		nsp=n-1;
		while (row<=n) {
			int cst=1,csp=1;
			int na=n-row+1;
			while (csp<=nsp) {
				System.out.print("  ");
				csp+=1;
			}
			while (cst<=nst) {
				if (cst==(nst/2)+1) {
					System.out.print("0 ");
				}
				else if (cst<=nst/2) {
					System.out.print(na+" ");
					na+=1;
				}
				else {
					if (na==n) {
						na-=1;
					}
					System.out.print(na+" ");
					na-=1;
				}
				cst+=1;
			}
			System.out.println();
			row+=1;
			nst+=2;
			nsp-=1;
		}
	}

}
