package parte1;

public class TestClass implements Predicate{

	@Override
	public boolean method(Object object) {
		if(object.getClass().equals(Integer.class)&&(int)object>100000){
			return true;
		}
		return false;
	}

}
