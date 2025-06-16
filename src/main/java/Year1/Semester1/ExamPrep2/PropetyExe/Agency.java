package Year1.Semester1.ExamPrep2.PropetyExe;

public class Agency {
    private Propety[] propeties;

    public String mostSelling(){
        if (propeties.length > 0){
            Seller seller = propeties[0].getSeller();
            int num = 0;
            for (int i = 0; i < propeties.length; i++) {
                Seller currSeller = propeties[i].getSeller();
                int currCounter = 0;
                for (int j = 0; j < propeties.length; j++) {
                    if (propeties[j].getSeller() == propeties[i].getSeller()){
                        currCounter++;
                    }
                }
                if (currCounter > num){
                    num = currCounter;
                    seller = propeties[i].getSeller();
                }
            }
            return seller.getFullName();
        }
        return "";
    }

    public int totalSize(){
        int size = 0;
        for (int i = 0; i < propeties.length; i++) {
            size += propeties[i].getSize();
        }
        return size;
    }
}
