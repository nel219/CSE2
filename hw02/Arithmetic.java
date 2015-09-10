public class Arithmetic{

  public static void main(String[] args) {

// shopping at Walmart, compute cost with 6% PA tax

// Number of pairs of socks
    int nSocks=3;
// Cost per pair of socks
    double sockCost$=2.58;
    
// Number of drinking glasses
    int nGlasses=6;
// Cost per glass
    double glassCost$=2.29;
    
// Number of boxes of envelopes
    int nEnvelopes=1;
// Cost per box of envelopes
    double envelopeCost$=3.25;
    
    double taxPercent=0.06;

// cost of items and their sales tax
    double totSockCost$=nSocks*sockCost$;
    double sockTax$=taxPercent*totSockCost$;
    
    double totGlassCost$=nGlasses*glassCost$;
    double glassTax$=taxPercent*totGlassCost$;
    
    double totEnvelopeCost$=nEnvelopes*envelopeCost$;
    double taxEnvelope$=taxPercent*totEnvelopeCost$;
    
// total cost of purchases before tax
    double subtotal$=totSockCost$+totGlassCost$+totGlassCost$;
// total transaction cost
    double total$=((subtotal$*taxPercent)+subtotal$);

// print lines
    System.out.println("Socks Subtotal = $"+totSockCost$);
    System.out.println("Socks Tax = $"+sockTax$);
    System.out.println("Glass Subtotal = $"+totGlassCost$);
    System.out.println("Glass Tax = $"+glassTax$);
    System.out.println("Envelopes Subtotal = $"+totEnvelopeCost$);
    System.out.println("Envelopes Tax = $"+taxEnvelope$);
    System.out.println("Subtotal = $"+subtotal$);
    System.out.println("Total = $"+total$);
  }
}
