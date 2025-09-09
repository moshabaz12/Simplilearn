package constructors;

public class Cuboid_demo {

	
	int width;
	int height;
	int depth;
	
	Cuboid_demo (int width, int height,int depth){
		
		this.width  = width;
		this.height = height;
		this.depth  = depth;
	}
	Cuboid_demo(int width, int height){
		this.width= width;
		this.height=  height;
		this.depth = 10;
		
		
	}
	Cuboid_demo(int dimension){
		width = dimension;
		height = dimension;
		depth = dimension;
		
	}
	Cuboid_demo(){
		this.width=10;
		this.height=10;
		this.depth=10;
		
	}
	int volume() {
		return width * height * depth;
	}
	public static void main(String[] args) {
		int volume ;
		
		Cuboid_demo stdCuboid_demo = new Cuboid_demo(10,20,15);
		volume = stdCuboid_demo.volume();
		System.out.println("volume of  a simple Cuboid_demo is : " + volume);
		
		Cuboid_demo Cuboid_demowidthDefaults =  new Cuboid_demo(10,20);
		volume = Cuboid_demowidthDefaults.volume();
		System.out.println("valume of Cuboid_demo width defaults depth is : "+ volume);
		
		Cuboid_demo cube =new Cuboid_demo(10);
		volume = cube.volume();
		System.out.println("volume of hello is  :" + volume);
		
		Cuboid_demo defaultCuboid_demo = new Cuboid_demo();
		volume = defaultCuboid_demo.volume();
	System.out.println("voluem odf default is : "+ volume);
	}

}
