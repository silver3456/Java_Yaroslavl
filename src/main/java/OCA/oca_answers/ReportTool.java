package OCA.oca_answers;

//https://vceguide.com/what-is-the-result-459/#comment-53892


class Tool implements Exportable {
    public void export() {

    }
}

public class ReportTool extends Tool implements Exportable {
    public void export() {
        System.out.println("RTool");
    }
}
