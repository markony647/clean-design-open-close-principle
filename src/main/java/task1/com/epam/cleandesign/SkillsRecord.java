package task1.com.epam.cleandesign;

public class SkillsRecord extends Record {

    private String skill;
    private SkillsLevel level;

    public String getSkill() {
        return skill;
    }

    public SkillsRecord setSkill(String skill) {
        this.skill = skill;
        return this;
    }

    public SkillsLevel getLevel() {
        return level;
    }

    public SkillsRecord setLevel(SkillsLevel level) {
        this.level = level;
        return this;
    }

    @Override
    public String getFormatted() {
        return "skills: " + getSkill() + "=" + getLevel();
    }
}
