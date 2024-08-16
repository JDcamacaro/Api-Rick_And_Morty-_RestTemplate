package com.JD.Api_Rick_And_Morty._RestTemplate.Response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListEpisode {

    private List<Episode> results;
}
