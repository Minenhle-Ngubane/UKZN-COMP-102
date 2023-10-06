public class Athlete {
    
    private String name;
    private int age; //age in completed years
    private double[] bestThrows = new double[5];
    private int numThrows;
    
    public Athlete(String name,int age) {
	this.name = name;
	this.age = age; 
    }

    public String getName() {
	return name;
    }
    
    public int getAge() {
	return age;
    }

    public double getBestThrow () {
	double max = bestThrows[0];
	for(int I = 1; I < bestThrows.length; I++){
	    if(bestThrows[I] > max){
		max = bestThrows[I];
	    }
	}
	return max;
    }

    public String toString(){
	String s = name;
	s += " " + age;
	s += " " + getBestThrow();
    }

    private double getMinIndex(){

	double min = bestThrows[0];
	int minIndex = 0;
	for(int I = 1; I < bestThrows.length; I++){
	    if(bestThrows[I] < min){
		min = bestThrows[I];
		minIndex = I;
	    }
	}
	return minIndex;
	
    }


    public void update(double newThrow){
	numThrows++;
	
	if(newThrow > bestThrows[getMinIndex()] ){
	    bestThrows[getMinIndex()] = attempt; 
	}
	
    }
    
}
