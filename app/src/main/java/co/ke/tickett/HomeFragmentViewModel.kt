package co.ke.tickett

import androidx.lifecycle.ViewModel;
import co.ke.tickett.data.repository.TicketRepository

class HomeFragmentViewModel(
    private val repository: TicketRepository
) : ViewModel() {
var name = "chris topher"
}
