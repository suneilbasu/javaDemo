public class CatCreate {
	public static void main(String[] args){
		Cat puss = new Cat();

		puss.setAge(3);

		System.out.println("The Cat is "+ puss.getAge()+ " years old");
	}
}