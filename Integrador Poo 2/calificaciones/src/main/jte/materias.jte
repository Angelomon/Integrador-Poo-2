@param edu.paginas.ModeloMaterias modelo


    <h2> Materias </h2>
    <div class = "table-responsive">
        <table class = "table table-hover table-striped">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nombre</th>
                    <th class="col-1" scope="col"> </th>
                    <th class="col-1" scope="col"> </th>
                    <th class="col-1" scope="col"> </th>
                </tr>
            </thead>
            <tbody>
                @for (var materia : modelo.Materias)
                    <tr>
                        <td score="row">${materia.getId()}</td>
                        <td>${materia.getNombre()}</td>
                        <td class="col-1"> <a type="button" class="btn btn-info no-gutters" href="materias/${materia.getId()}"> Editar </a></td>                            
                            <td class="col-1"> <button type="button" class="btn btn-danger no-gutters" onClick="borrar(${materia.getId()})"> Eliminar </button></td>
                            <td class="col-1"> <a href="/materias/${materia.getId()}/calificaciones" type="button" class="btn btn-secondary"> Calificaciones </a> </td>
                    </tr>
                @endfor
            </tbody>
        </table>
    </div>    
    
