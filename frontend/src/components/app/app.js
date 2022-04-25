import React from 'react';

const authors = (props) => {
    return (
        <div className={"container mm-6 mt-6"}>
            <div className={"row"}>
                <div className={"table-responsive"}>
                    <table className={"table table-striped"}>
                        <thead>
                            <tr>
                                <th scope={"col"}>Authors</th>
                            </tr>
                        </thead>
                        <tbody>
                            {props.authors.map((term) => {
                                return (
                                    <tr>
                                        <td>{term.name} {term.surname}</td>
                                    </tr>
                                );
                            })}
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    )
}

export default authors;