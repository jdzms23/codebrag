import com.softwaremill.codebrag.dao.{RepositoryHeadStore, CommitInfoDAO}
  var repoHeadStoreMock: RepositoryHeadStore = _
    repoHeadStoreMock = mock[RepositoryHeadStore]
    given(repoHeadStoreMock.get(TestRepoData.repositoryName)).willReturn(Some(lastCommit.getId.name))
      def repoHeadStore = repoHeadStoreMock