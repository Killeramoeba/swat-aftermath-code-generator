package gen;

public class Player 
{
	private int checksum;
	private String name;
	
	public Player(String name)
	{
		this.name = name;
		this.EncodeChecksum();	
	}

	String getName() 
	{ 
		return name;
	}
	

	int getChecksum() 
	{ 
		return checksum;
	}
	
	//returns int value for a char
	private int Values(char c){
		if (c=='a'|| c=='A')
			return 12;
		else if (c=='b'||c=='B')
			return 25;
		else if (c=='c'||c=='C')
			return 23;
		else if (c=='d' || c=='D')
			return 22;
		else if(c=='e'||c=='E')
			return 13;
		else if(c=='f'||c=='F')
			return 36;
		else if(c=='g'||c=='G')
			return 35;
		else if(c=='h'||c=='H')
			return 24;
		else if(c=='i'||c=='I')
			return 14;
		else if(c=='j'||c=='J')
			return 30;
		else if(c=='k'||c=='K')
			return 33;
		else if(c=='l'||c=='L')
			return 32;
		else if(c=='m'||c=='M')
			return 31;
		else if(c=='n'||c=='N')
			return 21;
		else if(c=='o'||c=='O')
			return 15;
		else if(c=='p'||c=='P')
			return 19;
		else if(c=='q'||c=='Q')
			return 37;
		else if(c=='r'||c=='R')
			return 26;
		else if(c=='s'||c=='S')
			return 18;
		else if(c=='t'||c=='T')
			return 20;
		else if(c=='u'||c=='U')
			return 17;
		else if(c=='v'||c=='V')
			return 28;
		else if(c=='w'||c=='W')
			return 34;
		else if(c=='x'||c=='X')
			return 27;
		else if(c=='y'||c=='Y')
			return 16;
		else if(c=='z'||c=='Z')
			return 29;
		else if (c=='0')
			return 9;
		else if (c=='1')
			return 11;
		else if (c=='2')
			return 8;
		else if (c=='3')
			return 10;
		else if (c=='4')
			return 6;
		else if (c=='5')
			return 2;
		else if (c=='6')
			return 3;
		else if (c=='7')
			return 7;
		else if (c=='8')
			return 5;
		else if (c=='9')
			return 4;
		else if (c=='_')
			return 1;
		else if (c=='-')
			return 38;
		else if (c=='!')
			return 39;
		else if (c=='.')
			return 40;
		else if(c=='('||c==')')
			return 41;
		else if(c=='['||c==']')
			return 42;
		else
			return 43;

	    }

	//encodes a full name
	private Player EncodeChecksum()
	{
	    for (int i = 1; i<=this.name.length(); i++)
	        this.checksum += Values(this.name.charAt(i-1))*((i%3)+1);
	    return this;
	}	
}

