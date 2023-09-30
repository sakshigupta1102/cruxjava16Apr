package session43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JobScheduling {
	// Given an array of jobs where every job has a deadline and
	// associated profit if the job is finished before the deadline.
	// It is also given that every job takes a single unit of time,
	// so the minimum possible deadline for any job is 1. Maximize
	// the total profit if only one job can be scheduled at a time.
	public static void main(String[] args) {
		int[] deadline = { 4, 2, 2, 2 };
		int[] profit = { 20, 10, 40, 30 };
		ArrayList<Job> list = new ArrayList();
		for (int i = 0; i < deadline.length; i++) {
			list.add(new Job(i + 1, deadline[i], profit[i]));
		}
		Collections.sort(list, new JobComp());
		int[] arr = new int[5];
		for (int i = 0; i < list.size(); i++) {
			int currd = list.get(i).deadline;
			for (int j = currd; j > 0; j--) {
				if (arr[j] == 0) {
					arr[j] = list.get(i).profit;
					break;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i];
		}
		
		System.out.println(ans);
	}

}

class Job {
	int jobid;
	int deadline;
	int profit;

	public Job(int jobid, int deadline, int profit) {
		this.jobid = jobid;
		this.deadline = deadline;
		this.profit = profit;
	}

	@Override
	public String toString() {
		return "Job [jobid=" + jobid + ", deadline=" + deadline + ", profit="
				+ profit + "]";
	}
}

class JobComp implements Comparator<Job> {
	@Override
	public int compare(Job o1, Job o2) {
		if (o1.profit > o2.profit)
			return -1;
		return 1;
	}
}
