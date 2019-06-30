import { Ator } from '../ator/ator';
import { Diretor } from '../diretor/diretor';
import { Genero } from '../genero/genero';

export interface FilmeDto {
  id?: string;
  nome: string;
  dataLancamento?: Date;
  diretor: Diretor;
  atores: Ator[];
  genero: Genero;
}
