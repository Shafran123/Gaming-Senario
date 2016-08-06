import java.util.Scanner;


class GAME{
	
static void sleepJIVM() {
		try{
			Thread.sleep(1000);
		}catch (Exception e){

		}
		
	}

	public static void main(String[] args) {
	   
	    //for (int i=1;i>0;i++){
		System.out.println("                                                                              ");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-Shaz Gaming Presents-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("                                                                              ");
		
		System.out.println("             =#&+                  \r\n            *@@@@:                 \r\n            @@@@@@                 \r\n            @@@@@@     ``          \r\n            @@@@@@ ?%&&%O          \r\n        `$#@@@@@@@.   #  =@!       \r\n       .@@@@@@@@@@@@@@@@@@@@@$$$$O#\r\n       @@@@@@@@@@@@#@@@$O$?#       \r\n       @@@@@@@@@@@e%@@& e @@       \r\n       @@@@@@@@@@@@@@@-o $@@;      \r\n       @@@@@@@@@@@@@@@e &@@@`      \r\n       @@@@@@@@@@@@@@@@@@@@o       \r\n      ~@@@@@@@@@@@@@@@@@@@o:       \r\n      _@@@@@@@@@@@@@@@@@@_ ~       \r\n      :@@@@@@@@@@ _&@@&:  .        \r\n      i@@@@@@@@@@         e        \r\n      #@@@@@@@@@&         #        \r\n      @@@@@@@@@@i+       ;         \r\n     &@@@@@@@@@@^ O#^    _         \r\n     @@@@@@@@@@@   ~&@i_i          \r\n    `@@@@@@@@@@@                   \r\n    =@@@@@@@@@@$                   \r\n    O@@@@@@@@@@@                   \r\n     @@@@@@@@@@@                   \r\n     @@@@@@@@@@@                   \r\n    *@@@@@@@@@@@o                  \r\n    @@@@@@@@@@@@@~                 \r\n    @@@@@@@@@@@@@~                 \r\n   _@@@@@@@@@@@@@#                 \r\n   e@@@@@@@&@@@@@e                 \r\n   $@@@@@@`~@@@@@O                 \r\n   &@@@@@$  @@@@@@                 \r\n   @@@@@@   :@@@@@                 \r\n   ~@@@@@    @@@@@e                \r\n   ?@@@@i    %@@@@e                \r\n  `@@@@@     ~@@@@$                \r\n  o@@@@&      @@@@@^               \r\n  #@@@@       O@@@@:               \r\n  @@@@i       ;@@@@+               \r\n :@@@@         @@@@=               \r\n @@@@&         @@@@=               \r\n.@@@@+         &@@@+               \r\n &@@@          .@@@                \r\n *@&            !@@                \r\n &@=            i@@;               \r\n @@_            $@@@;              \r\n`@@_            @@@@@&-            \r\ni@@?            .%&@@@@^           \r\n#@@@               ^O#.            \r\n;@@#                               \r\n");
		sleepJIVM();

			System.out.print("L");
			sleepJIVM();
			System.out.print("O");
			sleepJIVM();
			System.out.print("A");
			sleepJIVM();
			System.out.print("D");
			sleepJIVM();
		
			System.out.print("I");
			sleepJIVM();
			System.out.print("N");
			sleepJIVM();
			System.out.print("G");
			sleepJIVM();
			System.out.print(" ");
			sleepJIVM();
			
			System.out.print  ("<<<<<            ");
			System.out.print("Loading Completed");
			System.out.print  ("           >>>>>>");	
		

		System.out.println("                                                                              ");
		System.out.println("-*-*-*-*-*-*-*-*-*Find The Guns AND Elimanate the Enemy-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("                                                                              ");

		Soldire s = new Soldire(); 
		
							
									Scanner input = new Scanner(System.in);
									System.out.println("<<<<<<<<<   Select a Gun     >>>>>>>>>>>");
									System.out.println("                                        ");
									System.out.println(">>>>>> IF YOU WANT AK 47  PRESS 1 <<<<<<");
									System.out.println("                                        ");
									System.out.println(">>>>>> IF YOU WANT T56    PRESS 2 <<<<<<");
									System.out.println("                                        ");
									System.out.println(">>>>>> IF YOU WANT PISTOL PRESS 3 <<<<<<");
									System.out.println("                                        ");
									System.out.println(">>>>>> IF YOU WANT Quit   PRESS 6 <<<<<<");
									System.out.println("                                        ");
	 									for (int i=1;i>0;i++){
											int num1; 
											num1 = input.nextInt();
											if(num1==1){
											System.out.println("<******>          YOU PICKED Ak47           <******>");
											System.out.println("                                        "); 
											System.out.println("[[[[[[[[     PRESS 0 To Fire From Ak47      ]]]]]]]]");
										
														}
													
											if(num1==0){
											s.g.Ak47();

												}
														
											if(num1==2){
												System.out.println("<******>           YOU PICKED T56          <******>");
												System.out.println("                                        ");
												System.out.println("[[[[[[[[     PRESS 4 To Fire From T56      ]]]]]]]]");

												}

											if (num1==4) {
											s.g0.T56();
												}

											if (num1==3) {
											System.out.println("<******>          YOU PICKED Pistol           <******>");
											System.out.println("                                        ");
											System.out.println("[[[[[[[[     PRESS 5 To Fire From Pistol      ]]]]]]]]");
														
												}

											if (num1==5) {
											s.g1.Pistol();
												}
											if(num1==6){
												System.out.println("                                        ");
												System.out.println("******************Happy Gaming******************");
												System.out.println("                                        ");
												return;
											}
				
			}
		}

	

	}
	
class Soldire{

	Ak47 g = new Ak47();
	T56 g0 = new T56();
	Pistol g1 = new Pistol();
	
}

class Ak47 extends BulletAk47{

public static void Ak47(){
	BulletAk47 b = new BulletAk47();
	b.BulletsCount();
		}
	}		

class T56 extends BulletT56{
	public static void T56(){
	BulletT56 b1 = new BulletT56();
	b1.BulletsCount();
	}
}

class Pistol extends BulletPistol{
	public static void Pistol(){
		BulletPistol b2 = new BulletPistol();
		b2.BulletsCount();
	}
}

class BulletAk47{
public static void BulletsCount(){
Scanner input = new Scanner(System.in);

	
		for(int BulletsCount=30;BulletsCount>0;BulletsCount--){
		System.out.println("To Continue Fire Please Press 0");
			int num2;
			num2 = input.nextInt();
			if(num2==0){
			
			System.out.println("Bullets Count "+ BulletsCount +" Firing... From ****Ak47**** ");	
			System.out.println("                                    ");	
			
			System.out.println("                                                                            ");
			System.out.println("*********************IF u WANT To Reload Please Press 9*********************");
			System.out.println("                                                                            ");	
			System.out.println("                                                                            ");	
			System.out.println("*****************Please Press 7 to Change the Gun to T56********************");
			System.out.println("****************Please Press 8 to Change the Gun to Pistol******************");
			System.out.println("                                                                            ");	
	 		

			}

			if(num2==9){
			System.out.println("********************************Gun Reloaded********************************");
			BulletsCount();
			}		

			if (BulletsCount==1) {
				System.out.println("Out of Ammo");
				System.out.println("Please Reload The Gun ");
			}

			if (num2==7) {
	 			System.out.println("//////////////////////You Gun has been changeed To T56//////////////////////");
	 			System.out.println("To Continue Fire Please Press 4");
	 			BulletT56 g2 = new BulletT56();
	 			g2.BulletsCount();
	 		}


	 		if (num2==8) {
	 			System.out.println("//////////////////////You Gun has been changeed To Pistol////////////////////");
	 			BulletPistol g7 = new BulletPistol();
	 			g7.BulletsCount();
	 		}

	 		
			
			
			}
		
		

		}

}







class BulletT56{
public static void BulletsCount(){
Scanner input = new Scanner(System.in);

	
		for(int BulletsCount=30;BulletsCount>0;BulletsCount--){
		System.out.println("To Continue Fire Please Press 0");
			int num3;
			num3 = input.nextInt();
			
			if(num3==0){

		    
			System.out.println("Bullets Count "+ BulletsCount +" Firing... From ****T56**** ");	
			System.out.println("                                    ");	
			
			System.out.println("                                                                            ");
			System.out.println("*********************IF u WANT To Reload Please Press 9*********************");
			System.out.println("                                                                            ");	
			System.out.println("*****************Please Press 7 to Change the Gun to Ak47*******************");
			System.out.println("                                                                            ");
			System.out.println("****************Please Press 8 to Change the Gun to Pistol******************");
			System.out.println("                                                                            ");	
	
			}

			if(num3==9){
			System.out.println("********************************Gun Reloaded********************************");
			BulletsCount();
			}

			if (BulletsCount==1) {
				System.out.println("Out of Ammo");
				System.out.println("Please Reload The Gun ");
			}

			if (num3==7) {
	 			System.out.println("///////////////////////You Gun has been changeed To Ak47////////////////////");
	 			System.out.println("To Continue Fire Please Press 0");
	 			BulletAk47 g3 = new BulletAk47();
	 			g3.BulletsCount();
			}
			if (num3==8) {
	 			System.out.println("/////////////////////You Gun has been changeed To Pistol////////////////////");
	 			System.out.println("To Continue Fire Please Press 0");
	 			BulletPistol g6 = new BulletPistol();
	 			g6.BulletsCount();
			}

			if (BulletsCount==0) {
				System.out.println("Out of Ammo");
				System.out.println("Please Reload The Gun ");
			}
		}

	}

}




class BulletPistol{
	public static void BulletsCount(){
			Scanner input = new Scanner(System.in);
			for(int BulletsCount=30;BulletsCount>0;BulletsCount--){
			System.out.println("To Continue Fire Please Press 0");
			int num4; 			
			num4 = input.nextInt();

			if (num4==0) {
			System.out.println("                                    ");	
	 		System.out.println("Bullets Count "+  BulletsCount  +  " Firing....From      **********     Pistol     ***********");	
			System.out.println("                                    ");
	 			}
	 		System.out.println("*********************IF u WANT To Reload Please Press 9*********************");
	 		System.out.println("                                                                            ");	
			System.out.println("*****************Please Press 7 to Change the Gun to Ak47*******************");
			System.out.println("                                                                            ");
			System.out.println("*****************Please Press 8 to Change the Gun to T56********************");
			System.out.println("                                                                            ");


			if(num4==9){
			System.out.println("********************************Gun Reloaded********************************");
			BulletsCount();
			}

			if (BulletsCount==0) {
				System.out.println("Out of Ammo");
				System.out.println("Please Reload The Gun ");
			}

			if (num4==7) {
	 			System.out.println("///////////////////////You Gun has been changeed To Ak47////////////////////");
	 			System.out.println("To Continue Fire Please Press 0");
	 			BulletAk47 g4 = new BulletAk47();
	 			g4.BulletsCount();
			}

			if (num4==8) {
	 			System.out.println("///////////////////////You Gun has been changeed To T56////////////////////");
	 			System.out.println("To Continue Fire Please Press 0");
	 			BulletT56 g5 = new BulletT56();
	 			g5.BulletsCount();
			}
		}

	}
}