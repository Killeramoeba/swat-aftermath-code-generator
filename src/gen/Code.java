package gen;


public class Code {
	private String code;
	private int[] CharInfo;
	private final int ExperienceMod = 2500;
	private boolean isValid;
	
	public Code(Hero hero)
	{
		
		this.isValid = true;
		this.CharInfo = new int[16];
	}
	
	String getCode(Hero hero)
	{
		
		this.code = returnCode(hero);
		return code;
	}
	
	void setValid(boolean input)
	{
		this.isValid = input;
	}

	private String returnCode(Hero hero) {
		this.CharInfo = hero.getCharInfo();
		if(isValid)
		{
			return createCode(hero.getLevelUnlocked(), hero.getExperience(), hero.getPlayer() );	
		}
		else
		{
			return "Invalid Code!";
		}
	}
	
	//prints my code
	private  String createCode(int levelUnlocked, int experience, Player player)
	{
		String code = MakeCode(levelUnlocked, experience, player);
		return code.substring(0,4)+"-"+code.substring(4,8)+"-"+code.substring(8,12)+"-"+code.substring(12,16);
	}
	
	//used by ek (used by fk) (used by Gk)
	private  int vk(String s)
	{
		Player c = new Player(s);
		return c.getChecksum();
	}
	
	//used by ek (used by fk) (used by Gk)
	private  String fillZeros(int num,int zeros)
	{ 
		String s=""+num;
		while(s.length()<zeros)
		{
			s="0"+s;
		}
		return s;
	}
	
	//used by fk (used by Gk)
	private   String ok(int type,int armor,int trait,int spec,int talent,int unlocked,int rank,int jc,int key,int moh,int pcc,int cob,int lsa,int rem)
	{
		int code;
		int rand = (int) (Math.random()*4) *2;
		if (talent>0)
		{
			if (type==0)
			{
				if (talent==1)
					talent=1;
				else if (talent==2)
					talent=2;
				else if (talent==5)
					talent=3;
				else
					talent=0;
			}
			else if (type==1)
			{
				if (talent==1)
					talent=1;
				else if (talent==4)
					talent=2;
				else if (talent==6)
					talent=3;
				else
					talent=0;
			}
			else if (type==2) 
			{
				if (talent==1) 
					talent=1;
				else if (talent==2) 
					talent=2;
				else if (talent==6) 
					talent=3;
				else
					talent=0;
			}
			else if (type==3) 
			{
				if (talent==1) 
					talent=1;
				else if (talent==3)
					talent=2;
				else if (talent==6) 
					talent=3;
				else
					talent=0;
			}
			else if(type>9 && type<15)
			{
				if (talent==2) 
					talent=1;
				else if (talent==4) 
					talent=2;
				else if (talent==5) 
					talent=3;
				else
					talent=0;
			}
			else if (type==4) 
			{
				if (talent==6) 
					talent=1;
				else if (talent==4) 
					talent=2;
				else if (talent==5) 
					talent=3;
				else
					talent=0;
			}
			else if (type==5) 
			{
				if (talent==2) 
					talent=1;
				else if (talent==4) 
					talent=2;
				else if (talent==3) 
					talent=3;
				else
					talent=0;
			}
			else if (type==6) 
			{
				if (talent==3) 
					talent=1;
				else if (talent==2) 
					talent=2;
				else if (talent==6) 
					talent=3;
				else
					talent=0;
			}
			else if (type==7) 
			{
				if (talent==3) 
					talent=1;
				else if (talent==5) 
					talent=2;
				else if (talent==1) 
					talent=3;
				else
					talent=0;
			}
			else if (type>7&&type<10)
			{
				if (talent==4) 
					talent=1;
				else if (talent==5) 
					talent=2;
				else if (talent==3) 
					talent=3;
				else
					talent=0;
			}
			else if (type == 15)
			{
				if (talent==1)
					talent=1;
				else if (talent==5)
					talent=2;
				else if (talent==6)
					talent=3;
				else
					talent=0;
			}
			else
				talent=0;
		}
		if (type==6) 
			armor=2;
		else if (type==8)
		{
			type=6;
			armor=0;
		}
		else if (type==9) 
		{
			type=6;
			armor=1;
		}
		else if (type>9)
		{
			type=type-10;
			rand=rand+1;
		}
		if (armor>2) 
			armor=2;
		if (rank>10)
		{
			if( key+moh >1) 
				rank=14;
			else if (key>0) 
				rank=13;
			else if (moh>0) 
				rank=12;
		}
		if (rank>8) 
		{
			if (unlocked<4)
			{
				if (pcc<1) 
					unlocked=1;
				else
					unlocked=2;
			}
			else
			{
				if (pcc<1)
					unlocked=3;
			}
		}
		else if(rank>5&&unlocked<2)
			unlocked=2;
		else if(rank>2&&unlocked<1)
			unlocked=1;
		
		if (rank<9) 
		{
			if (unlocked<3)
			{
				cob=0;
				lsa=0;
			}
			else if (unlocked<1) 
				rem=0;
		}
		code=getRank(jc,10)+50*rank+50*15*unlocked+50*15*5*cob+50*15*5*2*lsa+50*15*5*2*2*rem;
		code=code+50*15*5*2*2*4*(type+8*armor+8*3*trait+8*3*18*spec+8*3*18*9*talent);
		return rand+fillZeros(code,9)+(jc%10);
	}
	
	//used by fk (used by Gk)
	private String ek(String xk)
	{
		int BC = CharInfo[2];
		int yh = CharInfo[6];
		if (BC==6)
		{
			if (yh==3)
				yh=1;
		}
		if (BC==7)
		{
			if (yh==1)
				yh = 6;
			else if (yh==3)
				yh=2;
		}
		if (BC==8 || BC==9)
		{
			if (yh==3)
				yh=6;
		}
		if (BC==4)
		{
			if (yh==6)
				yh=3;
		}
		if (BC==1)
		{
			if (yh==4)
				yh=3;
		}
		if (BC==3)
		{
			if (yh==6)
				yh=4;
		}
		if (BC==0)
		{
			if (yh==2)
				yh=3;
		}
		if (BC==5)
		{
			if (yh==3) 
				yh=6;
		}
		if (BC==2)
		{
			if (yh==6)
				yh=3;
		}
		
		return XL(xk,CharInfo[2],CharInfo[3],CharInfo[4],CharInfo[5],yh,CharInfo[7],CharInfo[8],CharInfo[9],CharInfo[10],CharInfo[11],CharInfo[12],CharInfo[13],CharInfo[14],CharInfo[15]);
	}
	
	//used by Gk
	private   int getRank(int i,int j)
	{
		return((i-(i%j))/j);
	}
	
	//used by Gk
	private String fk(String playerName)
	{
		int i;
		String Fk = ok(CharInfo[2],CharInfo[3],CharInfo[4],CharInfo[5],CharInfo[6],CharInfo[7],CharInfo[8],CharInfo[9],CharInfo[10],CharInfo[11],CharInfo[12],CharInfo[13],CharInfo[14],CharInfo[15]);
		String gk=ek(playerName);
		Fk=Fk.substring(0,3)+gk.substring(4,5)+Fk.substring(3,6)+gk.substring(3,4)+Fk.substring(6,9)+gk.substring(1,3)+Fk.substring(9,11)+gk.substring(0,1);
		i=Integer.parseInt(Fk.substring(0,1));
		return Fk.substring(0,1)+Fk.substring(16-i,16)+Fk.substring(1,16-i);
	}
	
	//returns my code
	private String MakeCode(int levelUnlocked,int experience, Player player)
	{
		CharInfo[7]=4-levelUnlocked;
		CharInfo[8]=getRank(experience,ExperienceMod);

		if (CharInfo[8]>9) 
			CharInfo[9]=0; // kL();
		else
			CharInfo[9]=getRank((experience%ExperienceMod),ExperienceMod/500);
		return fk(player.getName());
	}
	



	
	private   String XL(String eK,int Rd,int vH,int xK,int oK,int WH,int sk,int oC,int dC,int rK,int iK,int aK,int nK,int VK,int EK)
	{
		int i=vk(eK)*(WH+1)+(Rd+4)*(Rd+6)+(oC+1)*(dC+1)+(oK+1)*7654-(xK+1)*419-(vH+1)*50;
		i=i+(rK+1)*4+(iK+1)*9+(aK+1)*19+(nK+1)*39+(VK+1)*79+(EK+1)*159;
		i=i+100*(sk+1)*(i%1000);
		while (i>=100000)
			i=(i%100000)+getRank(i,100000);
		return fillZeros(i,5);
	}
	
	

}
