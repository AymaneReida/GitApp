package a.reida.gitapp.service;

import java.util.List;

import a.reida.gitapp.model.GitRepo;
import a.reida.gitapp.model.GitUsersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitRepoServiceAPI {
    @GET("search/users")
    public Call<GitUsersResponse> searchUsers(@Query("q") String query);
    @GET("users/{user}/repos")
    public Call<List<GitRepo>> userRepositories(@Path("user") String login);
}
