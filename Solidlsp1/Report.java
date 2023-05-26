package Solidlsp1;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private List<ReportItem> items;
    private Printable printable;



    public void calculate(){
        items = new ArrayList<ReportItem>();
        item.add(new ReportItem(description:"First",(float)5));
        item.add(new ReportItem(description:"Second",(float)6));
    }
}

public void setPrintable(Printable printable) {
    this.printable = printable;
}

public void output(){
    PrintReport reportPrint = new PrintReport();
    reportPrint.output(items);
}