package task1.com.epam.cleandesign;

import java.util.Map;
import java.util.stream.Collectors;

public class WorkloadRecord extends Record {

    private Map<Integer, Double> workload;

    public Map<Integer, Double> getWorkload() {
        return workload;
    }

    public void setWorkload(Map<Integer, Double> workload) {
        this.workload = workload;
    }

    @Override
    String getRecordFormatted() {
        return getWorkload().entrySet()
                .stream()
                .map(e -> e.getKey() + ":" + e.getValue())
                .collect(Collectors.joining(", ", "workload: ", ""));
    }
}
