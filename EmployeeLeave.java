class LeaveEmployee { void leaveLimit() { System.out.println("Leave limit"); } }
class LeaveDeveloper extends LeaveEmployee { void leaveLimit() { System.out.println("Developer: 15 days"); } }
class LeaveManager extends LeaveEmployee { void leaveLimit() { System.out.println("Manager: 20 days"); } }
class LeaveIntern extends LeaveEmployee { void leaveLimit() { System.out.println("Intern: 5 days"); } }
public class EmployeeLeave { public static void main(String[] args) { LeaveEmployee e = new LeaveDeveloper(); e.leaveLimit(); e = new LeaveManager(); e.leaveLimit(); e = new LeaveIntern(); e.leaveLimit(); } }
