/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

public interface BasicoConstants {
    String DOMAIN = "furb";
    String SERVICE = "basico";
    
    interface Commands {
    	/**
    	 * @see RetornaFilmesByDiretorInput the request payload
    	 */
    	String RETORNA_FILMES_BY_DIRETOR = "retornaFilmesByDiretor";
    	/**
    	 * The success response primitive for retornaFilmesByDiretor.
    	 *
    	 * @see #RETORNA_FILMES_BY_DIRETOR the request primitive
    	 * @see RetornaFilmesByDiretorOutput the response payload
    	 */
    	String RETORNA_FILMES_BY_DIRETOR_RESPONSE = "retornaFilmesByDiretorResponse";
    	/**
    	 * An error response primitive for retornaFilmesByDiretor.
    	 *
    	 * @see #RETORNA_FILMES_BY_DIRETOR the request primitive
    	 */
    	String RETORNA_FILMES_BY_DIRETOR_ERROR = "retornaFilmesByDiretorError";
    	/**
    	 * @see RetornaFilmesByGeneroInput the request payload
    	 */
    	String RETORNA_FILMES_BY_GENERO = "retornaFilmesByGenero";
    	/**
    	 * The success response primitive for retornaFilmesByGenero.
    	 *
    	 * @see #RETORNA_FILMES_BY_GENERO the request primitive
    	 * @see RetornaFilmesByGeneroOutput the response payload
    	 */
    	String RETORNA_FILMES_BY_GENERO_RESPONSE = "retornaFilmesByGeneroResponse";
    	/**
    	 * An error response primitive for retornaFilmesByGenero.
    	 *
    	 * @see #RETORNA_FILMES_BY_GENERO the request primitive
    	 */
    	String RETORNA_FILMES_BY_GENERO_ERROR = "retornaFilmesByGeneroError";
    	/**
    	 * @see RetornaFilmesByAtorInput the request payload
    	 */
    	String RETORNA_FILMES_BY_ATOR = "retornaFilmesByAtor";
    	/**
    	 * The success response primitive for retornaFilmesByAtor.
    	 *
    	 * @see #RETORNA_FILMES_BY_ATOR the request primitive
    	 * @see RetornaFilmesByAtorOutput the response payload
    	 */
    	String RETORNA_FILMES_BY_ATOR_RESPONSE = "retornaFilmesByAtorResponse";
    	/**
    	 * An error response primitive for retornaFilmesByAtor.
    	 *
    	 * @see #RETORNA_FILMES_BY_ATOR the request primitive
    	 */
    	String RETORNA_FILMES_BY_ATOR_ERROR = "retornaFilmesByAtorError";
    	/**
    	 * @see AtualizaStatusAtorInput the request payload
    	 */
    	String ATUALIZA_STATUS_ATOR = "atualizaStatusAtor";
    	/**
    	 * The success response primitive for atualizaStatusAtor.
    	 *
    	 * @see #ATUALIZA_STATUS_ATOR the request primitive
    	 * @see AtualizaStatusAtorOutput the response payload
    	 */
    	String ATUALIZA_STATUS_ATOR_RESPONSE = "atualizaStatusAtorResponse";
    	/**
    	 * An error response primitive for atualizaStatusAtor.
    	 *
    	 * @see #ATUALIZA_STATUS_ATOR the request primitive
    	 */
    	String ATUALIZA_STATUS_ATOR_ERROR = "atualizaStatusAtorError";
    	/**
    	 * @see DiretorEhExperienteInput the request payload
    	 */
    	String DIRETOR_EH_EXPERIENTE = "diretorEhExperiente";
    	/**
    	 * The success response primitive for diretorEhExperiente.
    	 *
    	 * @see #DIRETOR_EH_EXPERIENTE the request primitive
    	 * @see DiretorEhExperienteOutput the response payload
    	 */
    	String DIRETOR_EH_EXPERIENTE_RESPONSE = "diretorEhExperienteResponse";
    	/**
    	 * An error response primitive for diretorEhExperiente.
    	 *
    	 * @see #DIRETOR_EH_EXPERIENTE the request primitive
    	 */
    	String DIRETOR_EH_EXPERIENTE_ERROR = "diretorEhExperienteError";
    	/**
    	 * @see GeneroEhFamosoInput the request payload
    	 */
    	String GENERO_EH_FAMOSO = "generoEhFamoso";
    	/**
    	 * The success response primitive for generoEhFamoso.
    	 *
    	 * @see #GENERO_EH_FAMOSO the request primitive
    	 * @see GeneroEhFamosoOutput the response payload
    	 */
    	String GENERO_EH_FAMOSO_RESPONSE = "generoEhFamosoResponse";
    	/**
    	 * An error response primitive for generoEhFamoso.
    	 *
    	 * @see #GENERO_EH_FAMOSO the request primitive
    	 */
    	String GENERO_EH_FAMOSO_ERROR = "generoEhFamosoError";
    	/**
    	 * @see AdicionaAtorAoFilmeInput the request payload
    	 */
    	String ADICIONA_ATOR_AO_FILME = "adicionaAtorAoFilme";
    	/**
    	 * The success response primitive for adicionaAtorAoFilme.
    	 *
    	 * @see #ADICIONA_ATOR_AO_FILME the request primitive
    	 * @see AdicionaAtorAoFilmeOutput the response payload
    	 */
    	String ADICIONA_ATOR_AO_FILME_RESPONSE = "adicionaAtorAoFilmeResponse";
    	/**
    	 * An error response primitive for adicionaAtorAoFilme.
    	 *
    	 * @see #ADICIONA_ATOR_AO_FILME the request primitive
    	 */
    	String ADICIONA_ATOR_AO_FILME_ERROR = "adicionaAtorAoFilmeError";
    	/**
    	 * @see TrocaDiretorFilmeInput the request payload
    	 */
    	String TROCA_DIRETOR_FILME = "trocaDiretorFilme";
    	/**
    	 * The success response primitive for trocaDiretorFilme.
    	 *
    	 * @see #TROCA_DIRETOR_FILME the request primitive
    	 * @see TrocaDiretorFilmeOutput the response payload
    	 */
    	String TROCA_DIRETOR_FILME_RESPONSE = "trocaDiretorFilmeResponse";
    	/**
    	 * An error response primitive for trocaDiretorFilme.
    	 *
    	 * @see #TROCA_DIRETOR_FILME the request primitive
    	 */
    	String TROCA_DIRETOR_FILME_ERROR = "trocaDiretorFilmeError";
    	/**
    	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
    	 * @see GetMetadataInput the request payload
    	 */
    	String GET_METADATA = "getMetadata";
    	/**
    	 * The success response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 * @see GetMetadataOutput the response payload
    	 */
    	String GET_METADATA_RESPONSE = "getMetadataResponse";
    	/**
    	 * An error response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 */
    	String GET_METADATA_ERROR = "getMetadataError";
    	/**
    	 * @see ImportGeneroInput the request payload
    	 */
    	String IMPORT_GENERO = "importGenero";
    	/**
    	 * The success response primitive for importGenero.
    	 *
    	 * @see #IMPORT_GENERO the request primitive
    	 * @see ImportGeneroOutput the response payload
    	 */
    	String IMPORT_GENERO_RESPONSE = "importGeneroResponse";
    	/**
    	 * An error response primitive for importGenero.
    	 *
    	 * @see #IMPORT_GENERO the request primitive
    	 */
    	String IMPORT_GENERO_ERROR = "importGeneroError";
    	/**
    	 * @see ExportGeneroInput the request payload
    	 */
    	String EXPORT_GENERO = "exportGenero";
    	/**
    	 * The success response primitive for exportGenero.
    	 *
    	 * @see #EXPORT_GENERO the request primitive
    	 * @see ExportGeneroOutput the response payload
    	 */
    	String EXPORT_GENERO_RESPONSE = "exportGeneroResponse";
    	/**
    	 * An error response primitive for exportGenero.
    	 *
    	 * @see #EXPORT_GENERO the request primitive
    	 */
    	String EXPORT_GENERO_ERROR = "exportGeneroError";
    	/**
    	 * @see ImportDiretorInput the request payload
    	 */
    	String IMPORT_DIRETOR = "importDiretor";
    	/**
    	 * The success response primitive for importDiretor.
    	 *
    	 * @see #IMPORT_DIRETOR the request primitive
    	 * @see ImportDiretorOutput the response payload
    	 */
    	String IMPORT_DIRETOR_RESPONSE = "importDiretorResponse";
    	/**
    	 * An error response primitive for importDiretor.
    	 *
    	 * @see #IMPORT_DIRETOR the request primitive
    	 */
    	String IMPORT_DIRETOR_ERROR = "importDiretorError";
    	/**
    	 * @see ExportDiretorInput the request payload
    	 */
    	String EXPORT_DIRETOR = "exportDiretor";
    	/**
    	 * The success response primitive for exportDiretor.
    	 *
    	 * @see #EXPORT_DIRETOR the request primitive
    	 * @see ExportDiretorOutput the response payload
    	 */
    	String EXPORT_DIRETOR_RESPONSE = "exportDiretorResponse";
    	/**
    	 * An error response primitive for exportDiretor.
    	 *
    	 * @see #EXPORT_DIRETOR the request primitive
    	 */
    	String EXPORT_DIRETOR_ERROR = "exportDiretorError";
    	/**
    	 * @see ImportAtorInput the request payload
    	 */
    	String IMPORT_ATOR = "importAtor";
    	/**
    	 * The success response primitive for importAtor.
    	 *
    	 * @see #IMPORT_ATOR the request primitive
    	 * @see ImportAtorOutput the response payload
    	 */
    	String IMPORT_ATOR_RESPONSE = "importAtorResponse";
    	/**
    	 * An error response primitive for importAtor.
    	 *
    	 * @see #IMPORT_ATOR the request primitive
    	 */
    	String IMPORT_ATOR_ERROR = "importAtorError";
    	/**
    	 * @see ExportAtorInput the request payload
    	 */
    	String EXPORT_ATOR = "exportAtor";
    	/**
    	 * The success response primitive for exportAtor.
    	 *
    	 * @see #EXPORT_ATOR the request primitive
    	 * @see ExportAtorOutput the response payload
    	 */
    	String EXPORT_ATOR_RESPONSE = "exportAtorResponse";
    	/**
    	 * An error response primitive for exportAtor.
    	 *
    	 * @see #EXPORT_ATOR the request primitive
    	 */
    	String EXPORT_ATOR_ERROR = "exportAtorError";
    	/**
    	 * @see ImportFilmeInput the request payload
    	 */
    	String IMPORT_FILME = "importFilme";
    	/**
    	 * The success response primitive for importFilme.
    	 *
    	 * @see #IMPORT_FILME the request primitive
    	 * @see ImportFilmeOutput the response payload
    	 */
    	String IMPORT_FILME_RESPONSE = "importFilmeResponse";
    	/**
    	 * An error response primitive for importFilme.
    	 *
    	 * @see #IMPORT_FILME the request primitive
    	 */
    	String IMPORT_FILME_ERROR = "importFilmeError";
    	/**
    	 * @see ExportFilmeInput the request payload
    	 */
    	String EXPORT_FILME = "exportFilme";
    	/**
    	 * The success response primitive for exportFilme.
    	 *
    	 * @see #EXPORT_FILME the request primitive
    	 * @see ExportFilmeOutput the response payload
    	 */
    	String EXPORT_FILME_RESPONSE = "exportFilmeResponse";
    	/**
    	 * An error response primitive for exportFilme.
    	 *
    	 * @see #EXPORT_FILME the request primitive
    	 */
    	String EXPORT_FILME_ERROR = "exportFilmeError";
    	/**
    	 * The 'list' request primitive for the Genero entity.
    	 * @see genero.pageRequest the request payload
    	 */
    	String LIST_GENERO = "listGenero";
    	/**
    	 * The success response primitive for listGenero.
    	 *
    	 * @see #LIST_GENERO the request primitive
    	 * @see Genero.PagedResults the response payload
    	 */
    	String LIST_GENERO_RESPONSE = "listGeneroResponse";
    	/**
    	 * An error response primitive for listGenero.
    	 *
    	 * @see #LIST_GENERO the request primitive
    	 */
    	String LIST_GENERO_ERROR = "listGeneroError";
    	/**
    	 * The 'list' request primitive for the Diretor entity.
    	 * @see diretor.pageRequest the request payload
    	 */
    	String LIST_DIRETOR = "listDiretor";
    	/**
    	 * The success response primitive for listDiretor.
    	 *
    	 * @see #LIST_DIRETOR the request primitive
    	 * @see Diretor.PagedResults the response payload
    	 */
    	String LIST_DIRETOR_RESPONSE = "listDiretorResponse";
    	/**
    	 * An error response primitive for listDiretor.
    	 *
    	 * @see #LIST_DIRETOR the request primitive
    	 */
    	String LIST_DIRETOR_ERROR = "listDiretorError";
    	/**
    	 * The 'list' request primitive for the Ator entity.
    	 * @see ator.pageRequest the request payload
    	 */
    	String LIST_ATOR = "listAtor";
    	/**
    	 * The success response primitive for listAtor.
    	 *
    	 * @see #LIST_ATOR the request primitive
    	 * @see Ator.PagedResults the response payload
    	 */
    	String LIST_ATOR_RESPONSE = "listAtorResponse";
    	/**
    	 * An error response primitive for listAtor.
    	 *
    	 * @see #LIST_ATOR the request primitive
    	 */
    	String LIST_ATOR_ERROR = "listAtorError";
    	/**
    	 * The 'list' request primitive for the Filme entity.
    	 * @see filme.pageRequest the request payload
    	 */
    	String LIST_FILME = "listFilme";
    	/**
    	 * The success response primitive for listFilme.
    	 *
    	 * @see #LIST_FILME the request primitive
    	 * @see Filme.PagedResults the response payload
    	 */
    	String LIST_FILME_RESPONSE = "listFilmeResponse";
    	/**
    	 * An error response primitive for listFilme.
    	 *
    	 * @see #LIST_FILME the request primitive
    	 */
    	String LIST_FILME_ERROR = "listFilmeError";
    	/**
    	 * Returns a list with all dependencies from this service, along with their respective versions
    	 */
    	String GET_DEPENDENCIES = "getDependencies";
    	/**
    	 * The success response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 * @see GetDependenciesOutput the response payload
    	 */
    	String GET_DEPENDENCIES_RESPONSE = "getDependenciesResponse";
    	/**
    	 * An error response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 */
    	String GET_DEPENDENCIES_ERROR = "getDependenciesError";
    	/**
    	 * The 'create' request primitive for the Genero entity.
    	 * @see Genero the request payload
    	 */
    	String CREATE_GENERO = "createGenero";
    	/**
    	 * The success response primitive for createGenero.
    	 *
    	 * @see #CREATE_GENERO the request primitive
    	 */
    	String CREATE_GENERO_RESPONSE = "createGeneroResponse";
    	/**
    	 * An error response primitive for createGenero.
    	 *
    	 * @see #CREATE_GENERO the request primitive
    	 */
    	String CREATE_GENERO_ERROR = "createGeneroError";
    	/**
    	 * The 'createBulk' request primitive for the Genero entity.
    	 * @see CreateBulkGeneroInput the request payload
    	 */
    	String CREATE_BULK_GENERO = "createBulkGenero";
    	/**
    	 * The success response primitive for createBulkGenero.
    	 *
    	 * @see #CREATE_BULK_GENERO the request primitive
    	 * @see CreateBulkGeneroOutput the response payload
    	 */
    	String CREATE_BULK_GENERO_RESPONSE = "createBulkGeneroResponse";
    	/**
    	 * An error response primitive for createBulkGenero.
    	 *
    	 * @see #CREATE_BULK_GENERO the request primitive
    	 */
    	String CREATE_BULK_GENERO_ERROR = "createBulkGeneroError";
    	/**
    	 * The 'createMerge' request primitive for the Genero entity.
    	 * @see Genero the request payload
    	 */
    	String CREATE_MERGE_GENERO = "createMergeGenero";
    	/**
    	 * The success response primitive for createMergeGenero.
    	 *
    	 * @see #CREATE_MERGE_GENERO the request primitive
    	 */
    	String CREATE_MERGE_GENERO_RESPONSE = "createMergeGeneroResponse";
    	/**
    	 * An error response primitive for createMergeGenero.
    	 *
    	 * @see #CREATE_MERGE_GENERO the request primitive
    	 */
    	String CREATE_MERGE_GENERO_ERROR = "createMergeGeneroError";
    	/**
    	 * The 'retrieve' request primitive for the Genero entity.
    	 * @see Genero.Id the request payload
    	 */
    	String RETRIEVE_GENERO = "retrieveGenero";
    	/**
    	 * The success response primitive for retrieveGenero.
    	 *
    	 * @see #RETRIEVE_GENERO the request primitive
    	 */
    	String RETRIEVE_GENERO_RESPONSE = "retrieveGeneroResponse";
    	/**
    	 * An error response primitive for retrieveGenero.
    	 *
    	 * @see #RETRIEVE_GENERO the request primitive
    	 */
    	String RETRIEVE_GENERO_ERROR = "retrieveGeneroError";
    	/**
    	 * The 'update' request primitive for the Genero entity.
    	 * @see Genero the request payload
    	 */
    	String UPDATE_GENERO = "updateGenero";
    	/**
    	 * The success response primitive for updateGenero.
    	 *
    	 * @see #UPDATE_GENERO the request primitive
    	 */
    	String UPDATE_GENERO_RESPONSE = "updateGeneroResponse";
    	/**
    	 * An error response primitive for updateGenero.
    	 *
    	 * @see #UPDATE_GENERO the request primitive
    	 */
    	String UPDATE_GENERO_ERROR = "updateGeneroError";
    	/**
    	 * The 'updateMerge' request primitive for the Genero entity.
    	 * @see Genero the request payload
    	 */
    	String UPDATE_MERGE_GENERO = "updateMergeGenero";
    	/**
    	 * The success response primitive for updateMergeGenero.
    	 *
    	 * @see #UPDATE_MERGE_GENERO the request primitive
    	 */
    	String UPDATE_MERGE_GENERO_RESPONSE = "updateMergeGeneroResponse";
    	/**
    	 * An error response primitive for updateMergeGenero.
    	 *
    	 * @see #UPDATE_MERGE_GENERO the request primitive
    	 */
    	String UPDATE_MERGE_GENERO_ERROR = "updateMergeGeneroError";
    	/**
    	 * The 'delete' request primitive for the Genero entity.
    	 * @see Genero.Id the request payload
    	 */
    	String DELETE_GENERO = "deleteGenero";
    	/**
    	 * The success response primitive for deleteGenero.
    	 *
    	 * @see #DELETE_GENERO the request primitive
    	 */
    	String DELETE_GENERO_RESPONSE = "deleteGeneroResponse";
    	/**
    	 * An error response primitive for deleteGenero.
    	 *
    	 * @see #DELETE_GENERO the request primitive
    	 */
    	String DELETE_GENERO_ERROR = "deleteGeneroError";
    	/**
    	 * The 'create' request primitive for the Diretor entity.
    	 * @see Diretor the request payload
    	 */
    	String CREATE_DIRETOR = "createDiretor";
    	/**
    	 * The success response primitive for createDiretor.
    	 *
    	 * @see #CREATE_DIRETOR the request primitive
    	 */
    	String CREATE_DIRETOR_RESPONSE = "createDiretorResponse";
    	/**
    	 * An error response primitive for createDiretor.
    	 *
    	 * @see #CREATE_DIRETOR the request primitive
    	 */
    	String CREATE_DIRETOR_ERROR = "createDiretorError";
    	/**
    	 * The 'createBulk' request primitive for the Diretor entity.
    	 * @see CreateBulkDiretorInput the request payload
    	 */
    	String CREATE_BULK_DIRETOR = "createBulkDiretor";
    	/**
    	 * The success response primitive for createBulkDiretor.
    	 *
    	 * @see #CREATE_BULK_DIRETOR the request primitive
    	 * @see CreateBulkDiretorOutput the response payload
    	 */
    	String CREATE_BULK_DIRETOR_RESPONSE = "createBulkDiretorResponse";
    	/**
    	 * An error response primitive for createBulkDiretor.
    	 *
    	 * @see #CREATE_BULK_DIRETOR the request primitive
    	 */
    	String CREATE_BULK_DIRETOR_ERROR = "createBulkDiretorError";
    	/**
    	 * The 'createMerge' request primitive for the Diretor entity.
    	 * @see Diretor the request payload
    	 */
    	String CREATE_MERGE_DIRETOR = "createMergeDiretor";
    	/**
    	 * The success response primitive for createMergeDiretor.
    	 *
    	 * @see #CREATE_MERGE_DIRETOR the request primitive
    	 */
    	String CREATE_MERGE_DIRETOR_RESPONSE = "createMergeDiretorResponse";
    	/**
    	 * An error response primitive for createMergeDiretor.
    	 *
    	 * @see #CREATE_MERGE_DIRETOR the request primitive
    	 */
    	String CREATE_MERGE_DIRETOR_ERROR = "createMergeDiretorError";
    	/**
    	 * The 'retrieve' request primitive for the Diretor entity.
    	 * @see Diretor.Id the request payload
    	 */
    	String RETRIEVE_DIRETOR = "retrieveDiretor";
    	/**
    	 * The success response primitive for retrieveDiretor.
    	 *
    	 * @see #RETRIEVE_DIRETOR the request primitive
    	 */
    	String RETRIEVE_DIRETOR_RESPONSE = "retrieveDiretorResponse";
    	/**
    	 * An error response primitive for retrieveDiretor.
    	 *
    	 * @see #RETRIEVE_DIRETOR the request primitive
    	 */
    	String RETRIEVE_DIRETOR_ERROR = "retrieveDiretorError";
    	/**
    	 * The 'update' request primitive for the Diretor entity.
    	 * @see Diretor the request payload
    	 */
    	String UPDATE_DIRETOR = "updateDiretor";
    	/**
    	 * The success response primitive for updateDiretor.
    	 *
    	 * @see #UPDATE_DIRETOR the request primitive
    	 */
    	String UPDATE_DIRETOR_RESPONSE = "updateDiretorResponse";
    	/**
    	 * An error response primitive for updateDiretor.
    	 *
    	 * @see #UPDATE_DIRETOR the request primitive
    	 */
    	String UPDATE_DIRETOR_ERROR = "updateDiretorError";
    	/**
    	 * The 'updateMerge' request primitive for the Diretor entity.
    	 * @see Diretor the request payload
    	 */
    	String UPDATE_MERGE_DIRETOR = "updateMergeDiretor";
    	/**
    	 * The success response primitive for updateMergeDiretor.
    	 *
    	 * @see #UPDATE_MERGE_DIRETOR the request primitive
    	 */
    	String UPDATE_MERGE_DIRETOR_RESPONSE = "updateMergeDiretorResponse";
    	/**
    	 * An error response primitive for updateMergeDiretor.
    	 *
    	 * @see #UPDATE_MERGE_DIRETOR the request primitive
    	 */
    	String UPDATE_MERGE_DIRETOR_ERROR = "updateMergeDiretorError";
    	/**
    	 * The 'delete' request primitive for the Diretor entity.
    	 * @see Diretor.Id the request payload
    	 */
    	String DELETE_DIRETOR = "deleteDiretor";
    	/**
    	 * The success response primitive for deleteDiretor.
    	 *
    	 * @see #DELETE_DIRETOR the request primitive
    	 */
    	String DELETE_DIRETOR_RESPONSE = "deleteDiretorResponse";
    	/**
    	 * An error response primitive for deleteDiretor.
    	 *
    	 * @see #DELETE_DIRETOR the request primitive
    	 */
    	String DELETE_DIRETOR_ERROR = "deleteDiretorError";
    	/**
    	 * The 'create' request primitive for the Ator entity.
    	 * @see Ator the request payload
    	 */
    	String CREATE_ATOR = "createAtor";
    	/**
    	 * The success response primitive for createAtor.
    	 *
    	 * @see #CREATE_ATOR the request primitive
    	 */
    	String CREATE_ATOR_RESPONSE = "createAtorResponse";
    	/**
    	 * An error response primitive for createAtor.
    	 *
    	 * @see #CREATE_ATOR the request primitive
    	 */
    	String CREATE_ATOR_ERROR = "createAtorError";
    	/**
    	 * The 'createBulk' request primitive for the Ator entity.
    	 * @see CreateBulkAtorInput the request payload
    	 */
    	String CREATE_BULK_ATOR = "createBulkAtor";
    	/**
    	 * The success response primitive for createBulkAtor.
    	 *
    	 * @see #CREATE_BULK_ATOR the request primitive
    	 * @see CreateBulkAtorOutput the response payload
    	 */
    	String CREATE_BULK_ATOR_RESPONSE = "createBulkAtorResponse";
    	/**
    	 * An error response primitive for createBulkAtor.
    	 *
    	 * @see #CREATE_BULK_ATOR the request primitive
    	 */
    	String CREATE_BULK_ATOR_ERROR = "createBulkAtorError";
    	/**
    	 * The 'createMerge' request primitive for the Ator entity.
    	 * @see Ator the request payload
    	 */
    	String CREATE_MERGE_ATOR = "createMergeAtor";
    	/**
    	 * The success response primitive for createMergeAtor.
    	 *
    	 * @see #CREATE_MERGE_ATOR the request primitive
    	 */
    	String CREATE_MERGE_ATOR_RESPONSE = "createMergeAtorResponse";
    	/**
    	 * An error response primitive for createMergeAtor.
    	 *
    	 * @see #CREATE_MERGE_ATOR the request primitive
    	 */
    	String CREATE_MERGE_ATOR_ERROR = "createMergeAtorError";
    	/**
    	 * The 'retrieve' request primitive for the Ator entity.
    	 * @see Ator.Id the request payload
    	 */
    	String RETRIEVE_ATOR = "retrieveAtor";
    	/**
    	 * The success response primitive for retrieveAtor.
    	 *
    	 * @see #RETRIEVE_ATOR the request primitive
    	 */
    	String RETRIEVE_ATOR_RESPONSE = "retrieveAtorResponse";
    	/**
    	 * An error response primitive for retrieveAtor.
    	 *
    	 * @see #RETRIEVE_ATOR the request primitive
    	 */
    	String RETRIEVE_ATOR_ERROR = "retrieveAtorError";
    	/**
    	 * The 'update' request primitive for the Ator entity.
    	 * @see Ator the request payload
    	 */
    	String UPDATE_ATOR = "updateAtor";
    	/**
    	 * The success response primitive for updateAtor.
    	 *
    	 * @see #UPDATE_ATOR the request primitive
    	 */
    	String UPDATE_ATOR_RESPONSE = "updateAtorResponse";
    	/**
    	 * An error response primitive for updateAtor.
    	 *
    	 * @see #UPDATE_ATOR the request primitive
    	 */
    	String UPDATE_ATOR_ERROR = "updateAtorError";
    	/**
    	 * The 'updateMerge' request primitive for the Ator entity.
    	 * @see Ator the request payload
    	 */
    	String UPDATE_MERGE_ATOR = "updateMergeAtor";
    	/**
    	 * The success response primitive for updateMergeAtor.
    	 *
    	 * @see #UPDATE_MERGE_ATOR the request primitive
    	 */
    	String UPDATE_MERGE_ATOR_RESPONSE = "updateMergeAtorResponse";
    	/**
    	 * An error response primitive for updateMergeAtor.
    	 *
    	 * @see #UPDATE_MERGE_ATOR the request primitive
    	 */
    	String UPDATE_MERGE_ATOR_ERROR = "updateMergeAtorError";
    	/**
    	 * The 'delete' request primitive for the Ator entity.
    	 * @see Ator.Id the request payload
    	 */
    	String DELETE_ATOR = "deleteAtor";
    	/**
    	 * The success response primitive for deleteAtor.
    	 *
    	 * @see #DELETE_ATOR the request primitive
    	 */
    	String DELETE_ATOR_RESPONSE = "deleteAtorResponse";
    	/**
    	 * An error response primitive for deleteAtor.
    	 *
    	 * @see #DELETE_ATOR the request primitive
    	 */
    	String DELETE_ATOR_ERROR = "deleteAtorError";
    	/**
    	 * The 'create' request primitive for the Filme entity.
    	 * @see Filme the request payload
    	 */
    	String CREATE_FILME = "createFilme";
    	/**
    	 * The success response primitive for createFilme.
    	 *
    	 * @see #CREATE_FILME the request primitive
    	 */
    	String CREATE_FILME_RESPONSE = "createFilmeResponse";
    	/**
    	 * An error response primitive for createFilme.
    	 *
    	 * @see #CREATE_FILME the request primitive
    	 */
    	String CREATE_FILME_ERROR = "createFilmeError";
    	/**
    	 * The 'createBulk' request primitive for the Filme entity.
    	 * @see CreateBulkFilmeInput the request payload
    	 */
    	String CREATE_BULK_FILME = "createBulkFilme";
    	/**
    	 * The success response primitive for createBulkFilme.
    	 *
    	 * @see #CREATE_BULK_FILME the request primitive
    	 * @see CreateBulkFilmeOutput the response payload
    	 */
    	String CREATE_BULK_FILME_RESPONSE = "createBulkFilmeResponse";
    	/**
    	 * An error response primitive for createBulkFilme.
    	 *
    	 * @see #CREATE_BULK_FILME the request primitive
    	 */
    	String CREATE_BULK_FILME_ERROR = "createBulkFilmeError";
    	/**
    	 * The 'createMerge' request primitive for the Filme entity.
    	 * @see Filme the request payload
    	 */
    	String CREATE_MERGE_FILME = "createMergeFilme";
    	/**
    	 * The success response primitive for createMergeFilme.
    	 *
    	 * @see #CREATE_MERGE_FILME the request primitive
    	 */
    	String CREATE_MERGE_FILME_RESPONSE = "createMergeFilmeResponse";
    	/**
    	 * An error response primitive for createMergeFilme.
    	 *
    	 * @see #CREATE_MERGE_FILME the request primitive
    	 */
    	String CREATE_MERGE_FILME_ERROR = "createMergeFilmeError";
    	/**
    	 * The 'retrieve' request primitive for the Filme entity.
    	 * @see Filme.Id the request payload
    	 */
    	String RETRIEVE_FILME = "retrieveFilme";
    	/**
    	 * The success response primitive for retrieveFilme.
    	 *
    	 * @see #RETRIEVE_FILME the request primitive
    	 */
    	String RETRIEVE_FILME_RESPONSE = "retrieveFilmeResponse";
    	/**
    	 * An error response primitive for retrieveFilme.
    	 *
    	 * @see #RETRIEVE_FILME the request primitive
    	 */
    	String RETRIEVE_FILME_ERROR = "retrieveFilmeError";
    	/**
    	 * The 'update' request primitive for the Filme entity.
    	 * @see Filme the request payload
    	 */
    	String UPDATE_FILME = "updateFilme";
    	/**
    	 * The success response primitive for updateFilme.
    	 *
    	 * @see #UPDATE_FILME the request primitive
    	 */
    	String UPDATE_FILME_RESPONSE = "updateFilmeResponse";
    	/**
    	 * An error response primitive for updateFilme.
    	 *
    	 * @see #UPDATE_FILME the request primitive
    	 */
    	String UPDATE_FILME_ERROR = "updateFilmeError";
    	/**
    	 * The 'updateMerge' request primitive for the Filme entity.
    	 * @see Filme the request payload
    	 */
    	String UPDATE_MERGE_FILME = "updateMergeFilme";
    	/**
    	 * The success response primitive for updateMergeFilme.
    	 *
    	 * @see #UPDATE_MERGE_FILME the request primitive
    	 */
    	String UPDATE_MERGE_FILME_RESPONSE = "updateMergeFilmeResponse";
    	/**
    	 * An error response primitive for updateMergeFilme.
    	 *
    	 * @see #UPDATE_MERGE_FILME the request primitive
    	 */
    	String UPDATE_MERGE_FILME_ERROR = "updateMergeFilmeError";
    	/**
    	 * The 'delete' request primitive for the Filme entity.
    	 * @see Filme.Id the request payload
    	 */
    	String DELETE_FILME = "deleteFilme";
    	/**
    	 * The success response primitive for deleteFilme.
    	 *
    	 * @see #DELETE_FILME the request primitive
    	 */
    	String DELETE_FILME_RESPONSE = "deleteFilmeResponse";
    	/**
    	 * An error response primitive for deleteFilme.
    	 *
    	 * @see #DELETE_FILME the request primitive
    	 */
    	String DELETE_FILME_ERROR = "deleteFilmeError";
    }
    
    interface Events {
    	/**
    	 * Default 'serviceStarted' event.
    	 */
    	String SERVICE_STARTED = "serviceStarted";
    	/**
    	 * Default 'notifyUser' event.
    	 */
    	String NOTIFY_USER_EVENT = "notifyUserEvent";
    	String IMPORT_GENERO_EVENT = "importGeneroEvent";
    	String EXPORT_GENERO_EVENT = "exportGeneroEvent";
    	String IMPORT_DIRETOR_EVENT = "importDiretorEvent";
    	String EXPORT_DIRETOR_EVENT = "exportDiretorEvent";
    	String IMPORT_ATOR_EVENT = "importAtorEvent";
    	String EXPORT_ATOR_EVENT = "exportAtorEvent";
    	String IMPORT_FILME_EVENT = "importFilmeEvent";
    	String EXPORT_FILME_EVENT = "exportFilmeEvent";
    }
    
}
