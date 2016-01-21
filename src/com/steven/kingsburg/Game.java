package com.steven.kingsburg;

public class Game {

	private int year;
	
	Player Player1 = new Player();
	Player Player2 = new Player();
	Player Player3 = new Player();
	Player Player4 = new Player();
	
	
	//List of Buildings
	Building Statue = new Building();
	Building Chapel = new Building();
	Building Church = new Building();
	Building Cathedral = new Building();
	Building Inn = new Building();
	Building Market = new Building();
	Building Farms = new Building();
	Building MerchantsGuild = new Building();
	Building GuardTower = new Building();
	Building Blacksmith = new Building();
	Building Barracks = new Building();
	Building WizardsGuild = new Building();
	Building Palisade = new Building();
	Building Stable = new Building();
	Building StoneWall = new Building();
	Building Fortress = new Building();
	Building Barricade = new Building();
	Building Crane = new Building();
	Building TownHall = new Building();
	Building Embassy = new Building();

	
	//List of Advisors
	Advisor Jester = new Advisor();			//1
	Advisor Squire = new Advisor();			//2
	Advisor Architect = new Advisor();		//3
	Advisor Merchant = new Advisor();		//4
	Advisor Sergeant = new Advisor();		//5
	Advisor Alchemist = new Advisor();		//6
	Advisor Astronomer = new Advisor();		//7
	Advisor Treasurer = new Advisor();		//8
	Advisor MasterHunter = new Advisor();	//9
	Advisor General = new Advisor();		//10
	Advisor Swordsmith = new Advisor();		//11
	Advisor Duchess = new Advisor();		//12
	Advisor Champion = new Advisor();		//13
	Advisor Smuggler = new Advisor();		//14
	Advisor Inventor = new Advisor();		//15
	Advisor Wizard = new Advisor();			//16
	Advisor Queen = new Advisor();			//17
	Advisor King = new Advisor();			//18
	
	//Zone 1: Player with least buildings gets extra die. If tie, lowest goods.
	//If tie with buildings and goods, tied players select good of their choice.
	
	//Zone 2: Spring.
	
	//Zone 3: Players with most buildings gets a victory point.
	
	//Zone 4: Summer.
	
	//Zone 5: Player with the least buildings gets Kings Envoy. If tie, lowest goods.
	//If tie with buildings and goods, no envoy is awarded.
	
	//Zone 6: Autumn.
	
	//Zone 7: Players can exchange 2 of any good for one soldier.
	
	//Zone 8: Winter.
	
	
}
