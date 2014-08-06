package rundeck


class User {
    String login
    String password
    String firstName
    String lastName
    String email
    Date dateCreated
    Date lastUpdated
    
    static mapping = {
        table "rduser"
    }
    String dashboardPref
    String filterPref
    static hasMany = [reportfilters:ReportFilter,jobfilters:ScheduledExecutionFilter,nodefilters:NodeFilter]
    static constraints={
        login(matches: '^[a-zA-Z0-9\\.@\\s_\\\\/-]+$')
        firstName(nullable:true, matches: '^[a-zA-Z0-9\\s\\.-]+$')
        lastName(nullable:true, matches: '^[a-zA-Z0-9\\s\\.-]+$')
        email(nullable:true,email: true)
        password(nullable:true)
        dashboardPref(nullable:true)
        filterPref(nullable:true)
    }
}
