package Semester1.ExamPrep2.SecondPriceProposalExe;

public class Auction {
    private Product product;
    private Proposal[] proposals;
    private int minimalOffer;
    private int minimalParticipants;

    public boolean addProposal(Proposal toAdd){
        if (toAdd.getBid() > this.minimalOffer){
            Proposal[] temp = new Proposal[this.proposals.length + 1];
            for (int i = 0; i < this.proposals.length; i++) {
                temp[i] = this.proposals[i];
            }
            temp[temp.length - 1] = toAdd;
            this.proposals = temp;
            return true;
        }
        return false;
    }

    public String toString(){
        if (this.proposals.length < minimalParticipants){
            String winner = proposals[0].getName();
            int highestBid = proposals[0].getBid();
            int secondHighestBid = highestBid;
            for (int i = 0; i < proposals.length; i++) {
                int currBid = proposals[i].getBid();
                if (currBid > highestBid){
                    secondHighestBid = highestBid;
                    highestBid = currBid;
                    winner = proposals[i].getName();
                } else if (currBid > secondHighestBid){
                    secondHighestBid = currBid;
                }
            }
            return "The winner in the auction is: " + winner + " whos gonna pay on the product: " + this.product.getPrice() +
                    " total cost of: " + secondHighestBid + ".";
        }
        return "The auction wont start.";
    }
}
