package com.deloitte.lab9.ex4;
import java.util.function.Supplier;

	class Student {
	    private String name;
	    private int age;

	   
	    public Student() {
	        this.name = "null";
	        this.age = 0;
	    }

	    
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + "}";
	    }
	}

	
	public class Lab9Ex4 {

	    public static void main(String[] args) {
	        
	        Supplier<Student> student = Student::new;

	        
	        Student studentInstance = student.get();

	        
	        studentInstance.setName("Rashmi");
	        studentInstance.setAge(22);

	        
	        System.out.println(studentInstance);
	    }
	}



