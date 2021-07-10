import { Component } from 'react';
import React from 'react';

import {getDataAsync} from '../api/CRUD';
import {Badge} from 'react-bootstrap';

class Home extends Component {

    constructor(props) {
        super(props);
        this.state ={
            testData: []
        }
    }

    componentDidMount() {
        getDataAsync('api/test/getData').then((data) =>
        this.setState({ testData: data })
      );
    }

    render() {
        return(
            <div>
                {this.state.testData.length > 0 ? this.state.testData.map((data) =>{
                    return (
                        <div>
                            <h3>
                                Test Data {data.name}: <Badge variant="secondary">{data.id}</Badge>
                            </h3>
                      </div>
                      )
                }) : <h4>Getting Data...</h4>}
            </div>
        );
    }
}

export default Home;