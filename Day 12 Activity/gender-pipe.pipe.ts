import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'genderPipe'
})
export class GenderPipePipe implements PipeTransform {

  transform(value : string, gen : string): string {
    if(gen == "Male")
    return "Mr."+value;
    else
    return "Ms."+value;
  }

}
