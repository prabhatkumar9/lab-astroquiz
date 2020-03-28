package model;

class User{

    private String name;
    private String number;
    private int age;
    private int height;
    private int weight;
    private String country;
    
    User (String name, String number, int age, int height, int weight, String country){
    	this.setName(name);
    	this.setNumber(number);
    	this.setAge(age);
    	this.setHeight(height);
    	this.setWeight(weight);
    	this.setCountry(country);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}