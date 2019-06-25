import * as moment from 'moment';
import { FilmeDto } from './filme-dto';

export class Filme {
    public id?: string;
    public nome: string;
    public dataLancamento: Date;

    public static fromDto(filmeDto: FilmeDto, originEntity?: string): Filme {
        const model: any = { ...filmeDto };

        model.dataLancamento = model.dataLancamento && moment(model.dataLancamento).toDate();

        return model as Filme;
    }

    public static toDto(filme: Filme, originEntity?: string): FilmeDto {
        const dto: any = { ...filme };

        dto.dataLancamento = dto.dataLancamento && moment(dto.dataLancamento).format();

        delete dto.label;

        return dto;
    }
}
