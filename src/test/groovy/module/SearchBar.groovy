package module

import geb.Module

class SearchBar extends Module
{

    static Closure base = { $('div.site-search') }

    static Closure content = {
        searchInput { $('#js-site-search-input') }
        searchBtn { $('span.glyphicon-search') }
        searchSuggestionsForm { $('ul.ui-autocomplete') }
        searchSuggestion { $('.ui-menu-item', 0) }
    }
}
