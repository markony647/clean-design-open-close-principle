package task1.com.epam.cleandesign;

public class FeedbackRecord extends Record {

    private String criterion;

    private FeedbackQuality feedbackQuality;

    public String getCriterion() {
        return criterion;
    }

    public FeedbackRecord setCriterion(String criterion) {
        this.criterion = criterion;
        return this;
    }

    public FeedbackQuality getQuality() {
        return feedbackQuality;
    }

    public FeedbackRecord setQuality(FeedbackQuality feedbackQuality) {
        this.feedbackQuality = feedbackQuality;
        return this;
    }

    @Override
    public String getFormatted() {
        return "feedback: " + getCriterion() + "=" + getQuality();
    }
}
