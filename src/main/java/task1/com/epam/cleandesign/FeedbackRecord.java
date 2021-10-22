package task1.com.epam.cleandesign;

public class FeedbackRecord extends Record {

    private String criterion;

    private Quality quality;

    public String getCriterion() {
        return criterion;
    }

    public FeedbackRecord setCriterion(String criterion) {
        this.criterion = criterion;
        return this;
    }

    public Quality getQuality() {
        return quality;
    }

    public FeedbackRecord setQuality(Quality quality) {
        this.quality = quality;
        return this;
    }

    @Override
    String getRecordFormatted() {
        return "feedback: " + getCriterion() + "=" + getQuality();
    }

    public enum Quality {
        OFTEN_EXCEEDS_EXPECTATION,
        SOMETIMES_EXCEEDS_EXPECTATION,
        MEETS_EXPECTATION,
        SOMETIMES_FAILS_TO_MEET_EXPECTATION,
        OFTEN_FAILS_TO_MEET_EXPECTATION
    }
}
