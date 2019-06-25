import * as moment from 'moment';
import { DiretorDto } from './diretor-dto';

export class Diretor {
  public id?: string;
  public nome?: string;
  public sobrenome?: string;
  public dataNascimento?: Date;

  public static fromDto(diretorDto: DiretorDto, originEntity?: string): Diretor {
    const model: any = { ...diretorDto };

    model.dataLancamento = model.dataLancamento && moment(model.dataLancamento).toDate();

    return model as Diretor;
  }

  public static toDto(diretor: Diretor, originEntity?: string): Diretor {
    const dto: any = { ...diretor };

    dto.dataLancamento = dto.dataLancamento && moment(dto.dataLancamento).format();

    delete dto.label;

    return dto;
  }
}
