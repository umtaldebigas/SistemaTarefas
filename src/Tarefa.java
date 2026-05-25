public class Tarefa {
    private String idTarefa;
    private String descricaoTarefa;
    private String progressoTarefa;
    private String criadoTarefa;
    private String atualizadoTarefa;

    public Tarefa(String idTarefa, String descricaoTarefa, String progressoTarefa, String criadoTarefa, String atualizadoTarefa) {
        this.idTarefa = idTarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.progressoTarefa = progressoTarefa;
        this.criadoTarefa = criadoTarefa;
        this.atualizadoTarefa = atualizadoTarefa;
    }

    public String getIdTarefa() {
        return idTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public String getProgressoTarefa() {
        return progressoTarefa;
    }

    public String getCriadoTarefa() {
        return criadoTarefa;
    }

    public String getAtualizadoTarefa() {
        return atualizadoTarefa;
    }

    public void setProgressoTarefa(String progressoTarefa) {
        this.progressoTarefa = progressoTarefa;
    }
}
