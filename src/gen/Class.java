package gen;

import java.util.Vector;

public class Class {
	
	private String type;
	private Vector<String> armor;
	private Vector<String> trait;
	private Vector<String> spec;
	private Vector<String> talent;
	private Vector<String> weapon;
	
	public Class(String type)
	{
		this.type = type;
		this.armor = setArmor(type);
		setTrait();
		setSpec();
		this.talent = setTalent(type);
		this.weapon = setWeapon(type);
	}
	public String getType() {
		return type;
	}
	
	private Vector<String> setWeapon(String type) {
		Vector<String> weapon = new Vector<String>();
		//weapon.add("-Weapon-");
		if(type.compareTo("Sniper")==0)
			weapon.add("Sniper Rifle");
		else if(type.compareTo("Medic")==0)
			weapon.add("Assault Rifle");
		else if(type.compareTo("Tactician")==0)
			weapon.add("Assault Rifle");
		else if(type.compareTo("Psychologist")==0)
			weapon.add("Assault Rifle");
		else if(type.compareTo("Heavy Ordinance")==0)
			weapon.add("Chaingun");
		else if(type.compareTo("Demolitions")==0)
			weapon.add("Rocket Launcher");
		else if(type.compareTo("Cyborg")==0)
			weapon.add("Vindicator");
		else if(type.compareTo("Pyrotechnician")==0)
			weapon.add("Flamethrower");
		else if (type.compareTo("Watchman")==0)
		{
			weapon.add("-Weapon-");
			weapon.add("Laser Rifle");
			weapon.add("Gatling Laser");
		}
		else if (type.compareTo("Maverick")==0)
		{
			weapon.add("-Weapon-");
			weapon.add("Assault Rifle");
			weapon.add("Sniper Rifle");
			weapon.add("Chaingun");
			weapon.add("Rocket Launcher");
			weapon.add("Flamethrower");
		}
		else if (type.compareTo("Tech Ops")==0)
			weapon.add("Sniper Rifle");
		else if (type.compareTo("Umbrella Clone")==0)
			weapon.add("Pistols");
		
		return weapon;
	}
	
	private Vector<String> setTalent(String type) {
		
		Vector<String> talent = new Vector<String>();
		
		talent.add("-Talent-");
		talent.add("Courage");
		
		if(type.compareTo("Sniper")==0)
		{
			talent.add("Running");
			talent.add("Tinkering");
			talent.add("Wiring");
		}
		else if(type.compareTo("Medic")==0)
		{
			talent.add("Hacking");
			talent.add("Toughness");
			talent.add("Wiring");
		}
		else if(type.compareTo("Tactician")==0)
		{
			talent.add("Running");
			talent.add("Hacking");
			talent.add("Wiring");
		}
		else if(type.compareTo("Psychologist")==0)
		{
			talent.add("Hacking");
			talent.add("Wiring");
			talent.add("Spotting");
		}
		else if(type.compareTo("Heavy Ordinance")==0)
		{
			talent.add("Running");
			talent.add("Toughness");
			talent.add("Tinkering");
		}
		else if(type.compareTo("Demolitions")==0)
		{
			talent.add("Running");
			talent.add("Toughness");
			talent.add("Spotting");
		}
		else if(type.compareTo("Cyborg")==0)
		{
			talent.add("Running");
			talent.add("Hacking");
			talent.add("Spotting");
		}
		else if(type.compareTo("Pyrotechnician")==0)
		{
			talent.add("Tinkering");
			talent.add("Toughness");
			talent.add("Spotting");
		}
		else if (type.compareTo("Watchman")==0)
		{
			talent.add("Toughness");
			talent.add("Tinkering");
			talent.add("Spotting");
		}
		else if (type.compareTo("Maverick")==0)
		{
			talent.add("Running");
			talent.add("Hacking");
			talent.add("Tinkering");
		}
		else if (type.compareTo("Tech Ops")==0)
		{
		}
		else if (type.compareTo("Umbrella Clone")==0)
		{
		}
		return talent;
	}

	private void setSpec() {
		spec = new Vector<String>();
		spec.add("-Spec-");
		spec.add("Weaponry");
		spec.add("Power Armor");
		spec.add("Energy Cells");
		spec.add("Cybernetics");
		spec.add("Triage");
		spec.add("Chemistry");
		spec.add("Leadership");
		spec.add("Robotics");
		spec.add("Espionage");
		return;
	}

	private void setTrait() {
		trait = new Vector<String>();
		trait.add("-Trait-");
		trait.add("Skilled");
		trait.add("Gifted");
		trait.add("Survivalist");
		trait.add("Dragoon");
		trait.add("Acrobat");
		trait.add("Swift Learner");
		trait.add("Healer");
		trait.add("Flower Child");
		trait.add("Chem Reliant");
		trait.add("Rad Resistant");
		trait.add("Gadgeteer");
		trait.add("Prowler");
		trait.add("Energizer");
		trait.add("Pack Rat");
		trait.add("Engineer");
		trait.add("Reckless");
		return;
	}

	private Vector<String> setArmor(String type) {
		Vector<String> armor = new Vector<String>();
		
		if (type.compareTo("Watchman")==0 || type.compareTo("Cyborg")==0)
		{
			armor.add("Advanced");
		}
		else
		{
			armor.add("-Armor-");
			armor.add("Light");
			armor.add("Medium");
			armor.add("Heavy");
		}
		
		return armor;
	}
	
	public Vector<String> getArmor()
	{
		return this.armor;
	}
	public Vector<String> getTrait()
	{
		return this.trait;
	}
	public Vector<String> getTalent()
	{
		return this.talent;
	}
	public Vector<String> getSpec()
	{
		return this.spec;
	}
	public Vector<String> getWeapon()
	{
		return this.weapon;
	}

}
