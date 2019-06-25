import * as moment from 'moment';
import { AtorDto } from './ator-dto';

export class Ator {
    public id?: string;
    public nome?: string;
    public sobrenome?: string;
    public dataNascimento?: Date;

    public static fromDto(atorDto: AtorDto, originEntity?: string): Ator {
        const model: any = { ...atorDto };

        model.dataLancamento = model.dataLancamento && moment(model.dataLancamento).toDate();

        return model as Ator;
    }

    public static toDto(ator: Ator, originEntity?: string): Ator {
        const dto: any = { ...ator };

        dto.dataLancamento = dto.dataLancamento && moment(dto.dataLancamento).format();

        delete dto.label;

        return dto;
    }
}
