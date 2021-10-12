class Publisher{
    String Publisher;
    Publisher(String publi){
    }
}
class Book{
    String name;
    Publisher publisher;
    Book(){}
    public Book(String name, Publisher publisher){
        this.name = name;
        this.publisher = publisher;
    }
}
class Litereture extends Book{
    String Lit_type = "Literature";
    Litereture(String name, Publisher publisher){
        super(name,publisher);
    }
    void display(){
        System.out.println("Name : "+super.name);
        System.out.println("Type : "+this.Lit_type);
        System.out.println("Publisher : "+this.publisher.Publisher);
    }
}
class Fiction extends Book{
    String Lit_type = "Fiction";
    Fiction(String name,Publisher publisher){
        super(name,publisher);
    }
    void display(){
        System.out.println("Name : "+super.name);
        System.out.println("Type : "+this.Lit_type);
        System.out.println("Publisher : "+this.publisher.Publisher);
    }
}
public class InheritanceBookExample {
   public static void main(String[] args){
       Publisher lp = new Publisher("S.Chand");
       Litereture l = new Litereture("As you like",lp);
       l.display();
       Publisher fp = new Publisher("Tata ..McGrew..Hill");
       Fiction f = new Fiction("Tempest",fp);
       f.display();
   }
}
