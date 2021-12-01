import java.io.Serializable;

public class Person implements Serializable {
	
	/**
	 * The serialization runtime associates with each serializable class
	 *  a version number, called a serialVersionUID, which is used during
	 *  deserialization to verify that the sender and receiver of a 
	 *  serialized object have loaded classes for that object that are 
	 *  compatible with respect to serialization. 
	 *  If the receiver has loaded a class for the object that has a 
	 *  different serialVersionUID than that of the corresponding 
	 *  sender's class, then deserialization will result in an 
	 *  InvalidClassException. A serializable class can declare its 
	 *  own serialVersionUID explicitly by declaring a field named 
	 *  serialVersionUID that must be static, final, and of type long.
	 */
	
	
	public static final long serialVersionUID = 42L;

	protected String[] name;
	protected String dob;
	protected String gender;
	protected String motto;

	/**
	 * Creates a new Person with name name, date of birth dob, and
	 * gender gender.
	 * 
	 * @param name the name of this Person.
	 * @param dob the date of birth of this Person, in DDMMYY format.
	 * @param gender the gender of this Person.
	 * @param motto the motto of this Person
	 */
	public Person(String[] name, String dob, String gender) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.motto = "Live long and prosper";
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		String result = new String("");
		for (String n : this.name) {
			result = result + n + " ";
		}
		result += ", " + this.dob;
		if (this.gender.equals("M")) {
			result += ", male";
		} else {
			result += ", female";
		}
		return result;
	}
}

