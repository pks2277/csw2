package Assignment_2;

import java.util.TreeMap;


    class Address{
        private String plotNo,at,post;

        public Address(String plotNo,String at,String post){
            this.plotNo=plotNo;
            this.at=at;
            this.post=post;
        }
        public String getPlotNo(){
            return plotNo;
        }
        public String getAt(){
            return at;
        }
        public String getPost(){
            return post;
        }
    }
    public class B_Q_02_treeMap {
    public static void main(String[] args) {

        TreeMap<String ,Address> addressBook=new TreeMap<>();
        addressBook.put("Prakhar",new Address("52/15","Right-Lane","Jagmohan Nagar"));
        addressBook.put("Atul",new Address("52/132","Right-Lane","Jagmohan Nagar"));
        addressBook.put("Anil",new Address("52/1435","Bh-3","Jagmohan Nagar"));

        for(String name:addressBook.keySet()){
            Address address=addressBook.get(name);
            System.out.println(name+" : Plot No. "+address.getPlotNo()+",At "+address.getAt()+" , Post "+address.getPost());
        }
    }
}
