import geb.spock.GebSpec
import pages.HomePage
import pages.SearchResultsPage

class SmokeSpec extends GebSpec {

    def "wilko search term"() {
        given:
        to(HomePage)

        when:
        at(HomePage)
                .search('wilko')

        then:
        at(SearchResultsPage)
    }
}