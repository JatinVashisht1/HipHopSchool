package com.example.hiphopschool.presentation.credits

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.hiphopschool.presentation.credits.components.CreditLinks
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CreditScreenViewModel @Inject constructor()
    : ViewModel() {
        private val _credits = mutableStateOf<List<CreditLinks>>(listOf(
            CreditLinks("History ", null),
            CreditLinks("History: ", "https://en.wikipedia.org/wiki/Hip_hop_music"),
            CreditLinks("GOATs", null),
            CreditLinks("BillBoard: ", "https://www.billboard.com/photos/6723017/the-10-best-rappers-of-all-time"),
            CreditLinks("Goliath: ", "https://www.goliath.com/music/the-15-greatest-rappers-of-all-time/"),
            CreditLinks("Soul in Stereo: ", "http://www.soulinstereo.com/2021/09/50-greatest-rappers-of-all-time-courtesy-of-the-soul-in-stereo-cypher.html"),
            CreditLinks("Soul in Stereo: ", "http://www.soulinstereo.com/2021/09/50-greatest-rappers-of-all-time-courtesy-of-the-soul-in-stereo-cypher.html"),
            CreditLinks("Greatest Hits", null),
            CreditLinks("Rolling Stone: ", "https://www.rollingstone.com/music/music-lists/100-greatest-hip-hop-songs-of-all-time-105784/grandmaster-flash-and-the-furious-five-the-message-3-102925/"),
            CreditLinks("Work and Money: ", "https://www.workandmoney.com/s/greatest-rap-songs-8aa1ca5cb52a49aa"),
            CreditLinks("Best Albums", null),
            CreditLinks("Hip Hop Golden Age: ", "https://hiphopgoldenage.com/list/the-best-250-hip-hop-albums-of-all-time/"),
            CreditLinks("ONE37pm: ", "https://www.one37pm.com/culture/music/best-hip-hop-albums"),
            CreditLinks("Beefs", null),
            CreditLinks("DAQUAN: ", "https://daquan.tv/music/diss-tracks-and-bust-ups-our-favorite-beefs-from-hip-hop-history"),
            CreditLinks("COMPLEX: ", "https://www.complex.com/music/biggest-hip-hop-rap-feuds/"),
            CreditLinks("Current Scenario: ", "https://en.wikipedia.org/wiki/Hip_hop_music")
        ))
    val credits : State<List<CreditLinks>> = _credits
}