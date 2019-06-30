package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class TrocaDiretorFilmeInput {
    
    /**
     * Nome do filme
     */
    public String filme;
    /**
     * Nome do genero
     */
    public String diretor;
    
    public TrocaDiretorFilmeInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public TrocaDiretorFilmeInput(String filme, String diretor) {
        this.filme = filme;
        this.diretor = diretor;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	BasicoValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (filme != null) {
            ret = 31 * ret + filme.hashCode();
        }
        if (diretor != null) {
            ret = 31 * ret + diretor.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrocaDiretorFilmeInput)) {
            return false;
        }
        TrocaDiretorFilmeInput other = (TrocaDiretorFilmeInput) obj;
        if ((filme == null) != (other.filme == null)) {
            return false;
        }
        if ((filme != null) && !filme.equals(other.filme)) {
            return false;
        }
        if ((diretor == null) != (other.diretor == null)) {
            return false;
        }
        if ((diretor != null) && !diretor.equals(other.diretor)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    void toString(StringBuilder sb, List<Object> appended) {
    	sb.append(getClass().getSimpleName()).append(" [");
    	if (appended.contains(this)) {
    		sb.append("<Previously appended object>").append(']');
    		return;
    	}
    	appended.add(this);
    	sb.append("filme=").append(filme == null ? "null" : filme).append(", ");
    	sb.append("diretor=").append(diretor == null ? "null" : diretor);
    	sb.append(']');
    }
    
}
